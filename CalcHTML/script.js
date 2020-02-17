function disparar() {
    var aux = document.getElementById('opS');
    var r = "Escolha uma operação...";
    var x = parseFloat(document.getElementById('x').value);
    var y = parseFloat(document.getElementById('y').value);
    if (aux.options[aux.selectedIndex].value === '1') {
        r = x + y;
    }
    if (aux.options[aux.selectedIndex].value === '2') {
        r = x - y;
    }
    if (aux.options[aux.selectedIndex].value === '3') {
        r = x / y;
    }
    if (aux.options[aux.selectedIndex].value === '4') {
        r = x * y;
    }
    document.getElementById('r').value = r;
}
