function addRow() {
    const table = document.getElementById("transaction-table").getElementsByTagName("tbody")[0];
    const newRow = table.insertRow();
    for (let i = 0; i < 6; i++) {
        const newCell = newRow.insertCell(i);
        if (i === 4) {
            const editButton = document.createElement("button");
            editButton.textContent = "Edit";
            editButton.onclick = function() { editRow(this); };
            newCell.appendChild(editButton);
        } else if (i === 5) {
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
    alert("Save button clicked!");
}

function exit() {
    alert("If you are Exit This Page then  clicked ok");
    window.location.href = 'stockentry.html';
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
