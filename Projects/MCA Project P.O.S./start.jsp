<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stock Transaction Entry</title>
    <style>
        *{   
    text-align: center;
    align-items: center;
    justify-content: center;
    justify-items: center;
}
body {
    background-color: gray;
    font-family: Arial, sans-serif;
    align-items: center;
    text-align: center;
    width: 100rem;
}
#head{
    width: 100rem;
}

.container {
    width: 80%;
    height: auto;
    margin: 0 auto;
    margin-right: 13rem;
    padding: 20px;
    border: 1px solid #000;
    background-color:aliceblue;
}

h1 {
    text-align: center;
    border-radius: 0%;
    border: #000;
}

.form-section {
    margin-bottom: 30px;
}

.form-row {
    display: flex;
    justify-content: space-between;
    margin-bottom: 10px;
}

label {
    display: flex;
    margin-left: 10rem;
    margin-right:8rem ;
}

input {
    padding: 5px;
    align-items: center;
    margin-left: 1rem;
    width: 12rem;
    margin-right:1rem ;
}

table {
    background-color:#f2f2f2;;
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 10px; 
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
  
  padding: calc(.5em + var(--s)) calc(.9em + var(--s));
  color: var(--color);
  --_p: var(--s);
  background:
    conic-gradient(from 90deg at var(--b) var(--b),#0000 90deg,var(--color) 0)
    var(--_p) var(--_p)/calc(100% - var(--b) - 2*var(--_p)) calc(100% - var(--b) - 2*var(--_p));
  transition: .3s linear, color 0s, background-color 0s;
  outline: var(--b) solid #0000;
  outline-offset: .6em;
  font-size: 16px;
  border: 0;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
}

button:hover,
button:focus-visible{
  --_p: 0px;
  outline-color: var(--color);
  outline-offset: .05em;
}

button:active {
  background: var(--color);
  color: #fff;
}

#Transaction-type{
    cursor: pointer;
}
#party-maintenance{
    cursor: pointer;
}
#hidden-input{
    display: none;
    margin-right: 10rem;
    padding-right: 10rem;
}
#input-text{
    margin-right: 3rem;

}
#stk-no{
    width: 17rem;
}
#trn-type{
    width: 12.6rem;
}
#date{
    width: 13.8rem;
}
#trn-no{
    width: 13.2rem;
}
#heading{
    background-color:rgb(177, 163, 163);
    margin-right: 25rem;
    margin-left: 25rem;
    padding-top: 0.5rem;
    padding-bottom: 0.5rem;
}
        </style>
</head>
<body>


    <div class="container">
        <table>
        <h1 id="heading">Stock Transaction Entry</h1>
    </table>
    <table id="main-frame" border="1">
        <div class="form-section">
            <div class="form-row">
                <label> Date And Time <input type="datetime-local" id="date" placeholder="##-##-####"></label>
                <label><div id="party-maintenance">Party Name </div><input type="text" id="party-name" placeholder="!!!!!!!!!!!!!!!!!!!!!!!!"></label>
            </div>
            <div class="form-row">
                <label>Stk-No. <input type="text" id="stk-no" placeholder="######"></label>
                <label>DL.No. <input type="text" id="dl-no" placeholder="xxx-auto-fill-xxxxxxxxx"></label>
            </div>
            <div class="form-row">
                <label><div id="Transaction-type">Transaction-Type </div> <input type="text" id="trn-type" placeholder="!!!!!!!!!!!!!!!!!!!!!!!!"></label>
                <label>Address <input type="text" id="address" placeholder="xxx-auto-fill-xxxxxxxxx"></label>
            </div>
            <div class="form-row">
                <label>Transaction-No. <input type="text" id="trn-no" placeholder="######"></label>
            </div>
        </div>
            <thead>
                <tr>
                    <th>SL</th>
                    <th>MFR</th>
                    <th>PRODUCT-NAME</th>
                    <th>BATCH-NO</th>
                    <th>MRP</th>
                    <th>RATE</th>
                    <th>QTY</th>
                    <th>FREE</th>
                    <th>TAX</th>
             
                    <th colspan="2">COSTOMIZE</th>
                </tr>
            </thead>
                <tbody id="cell">
                 
                </tbody>         
    </table>
        <div class="buttons">
            <button onclick="addRow()">Add</button>
            <button onclick="save()">Save</button>
            <button id="resetButton">Reset</button>
            <button onclick="search()">Search</button>
        </div>
    </div>
     

    <script>
        document.getElementById('Transaction-type').addEventListener('click',function(){
    window.location.href='transaction.html';
});

document.getElementById('party-maintenance').addEventListener('click',function(){
    window.location.href='partymaintenance.html';
});

function save() {
    var tableObj = document.getElementById("main-frame");
    var sql = "INSERT INTO xyz VALUES";
    for(var i=1; i<tableObj.rows.length; i++) {
        sql = sql + "('";
        for(var j=0; j<tableObj.rows[i].cells.length-2; j++) {
            sql = sql + tableObj.rows[i].cells[j].innerHTML + "','";
        }
        sql = sql + "')';'";
    }
    
    localStorage.setItem('query',sql);
    window.location.href='pratice1.jsp';
    //alert(sql);
}

document.getElementById('resetButton').addEventListener('click', function() {
    location.reload();
});

function search() {
    alert("Search button clicked!");
}

let serialNo = 0;
function addRow() {
    serialNo++;
    const table = document.getElementById("main-frame").getElementsByTagName("tbody")[0];
    const newRow = table.insertRow();

    const cell1 = newRow.insertCell(0);
    cell1.innerHTML = serialNo;

    for (let i = 1; i < 11; i++) {
        const newCell = newRow.insertCell(i);
        if (i === 9) {
            const editButton = document.createElement("button");
            editButton.textContent = "Edit";
            editButton.onclick = function() { editRow(this); };
            newCell.appendChild(editButton);
        } else if (i === 10) {
            const deleteButton = document.createElement("button");
            deleteButton.textContent = "Delete";
            deleteButton.onclick = function() { deleteRow(this); };
            newCell.appendChild(deleteButton);
        } else {
            newCell.contentEditable = true;
        }
    }
}

function checkEnter(event) {
    if (event.key === 'Enter') {
        addRow();
    }
}

function editRow(button) {
    const row = button.parentNode.parentNode;
    for (let i = 0; i < row.cells.length - 2; i++) {
        row.cells[i].contentEditable = true;
    }
}

function deleteRow(button) {
    const row = button.parentNode.parentNode;
    row.parentNode.removeChild(row);
}


    </script>
    
   <%
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        int newid = 0;
        Statement stmt  = conn.createStatement();
        
      
        int result=stmt.executeUpdate("query");
       out.println("success");
        
    } catch (ClassNotFoundException e) {
    	out.println("Driver not load");
    } catch (SQLException e) {
   		out.println("sql not right");
    }
    	
    %>
</body>
</html>