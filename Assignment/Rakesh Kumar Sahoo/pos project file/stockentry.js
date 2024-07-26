document.getElementById('Transaction-type').addEventListener('click',function(){
    window.location.href='transaction.html';
});

document.getElementById('party-maintenance').addEventListener('click',function(){
    window.location.href='partymaintenance.html';
});

function save() {
    alert("Save button clicked!");
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

    for (let i = 1; i < 13; i++) {
        const newCell = newRow.insertCell(i);
        if (i === 11) {
            const editButton = document.createElement("button");
            editButton.textContent = "Edit";
            editButton.onclick = function() { editRow(this); };
            newCell.appendChild(editButton);
        } else if (i === 12) {
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

