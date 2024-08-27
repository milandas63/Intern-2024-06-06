<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{   
    text-align: center;
}
body {
    font-family: Arial, sans-serif;
    background-color:gray;
}

.container {
    width: 80%;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #000;
    background-color:aliceblue;
}

h1 {
    text-align: center;
}

table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
    background-color:#f2f2f2;
}

th, td {
    border: 1px solid #000;
    padding: 8px;
    text-align: center;
}
th{
    background-color: rgb(198, 196, 196);
}

button {
  --b: 3px;   
  --s: .45em; 
  --color: #373B44;
  border-radius: 50rem;
  padding: calc(.3em + var(--s)) calc(.9em + var(--s));
  color: var(--color);
  font-size: 16px;
  cursor: pointer;
}
  

</style>
</head>
<body>
<div class="container">
        <h1>Add New Company</h1>
        <table id="transaction-table" border="1">
            <thead>
                 <tr>
			                <th>Product ID</th>
			                <th>Product Name</th>
			                <th>Batch NUmbrer</th>
			                <th>MRP</th>
			               <!--  <th>Expaire date</th> -->
			                <th>MFR ID</th>
			                <th>Delete</th>
			          </tr>
            </thead>
            <tbody>
                
            </tbody>
        </table>
        <div class="buttons">
            <button onclick="addRow()">Add</button>
            <button onclick="save()">Save</button>
            <button onclick="exit()">Exit</button>
        </div>
    </div>
    
</body>
<script>
function addRow() {
    const table = document.getElementById("transaction-table").getElementsByTagName("tbody")[0];
    const newRow = table.insertRow();
    for (let i = 0; i < 6; i++) {
        const newCell = newRow.insertCell(i);
       
       if (i === 5) {
            const deleteButton = document.createElement("button");
            deleteButton.textContent = "Delete";
            deleteButton.onclick = function() { deleteRow(this); };
            newCell.appendChild(deleteButton);
        } else {
            newCell.contentEditable = true;
        }
    }
}

function save() {
	var tableObj = document.getElementById("transaction-table");
    var sql = "insert into product values";
    for(var i=1; i<tableObj.rows.length; i++) {
        sql = sql + "('";
        for(var j=0; j<tableObj.rows[i].cells.length-1; j++) {
            sql = sql + tableObj.rows[i].cells[j].innerHTML + "'";
            if(j<tableObj.rows[i].cells.length-2)
             	sql = sql + ",'";
        }
        sql = sql + "),";
    }
	
    var query=sql;
    var str=query.substring(0,sql.length-1);
	
	//var leter=sql.charAt(sql.length-1);
	if(sql.charAt(sql.length-1)==','){
		sql=sql.charAt(sql.length-1).replace(',',';');
		
	}
	str+=sql;
	alert(str);
    window.location.href='productsubmit.jsp?sql='+str;
}

function exit() {
    alert("If you are Exit This Page then  clicked ok");
    window.location.href = 'product.jsp';
}



function deleteRow(button) {
    const row = button.parentNode.parentNode;
    row.parentNode.removeChild(row);
}
</script>
</html>