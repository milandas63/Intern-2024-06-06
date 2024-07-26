document.getElementById('saveBtn').addEventListener('click', function() {
    alert('Form data saved!');
});

document.getElementById('clearBtn').addEventListener('click', function() {
    document.getElementById('partyForm').reset();
});

document.getElementById('exitBtn').addEventListener('click', function() {
    alert("If you are Exit This Page then  clicked ok");
    window.location.href = 'stockentry.html';
});