const condiciones = [
    'ABCDEFGHIJKLMNOPQRSTUVWXYZ',
    'abcdefghijklmnopqrstuvwxyz',
    '0123456789',
    '!@#$%^&*()'
];

function obtenerCaracter(condicion) {
    return condicion[Math.floor(Math.random() * condicion.length)];
}

function generarPass() {
    const size = document.getElementById('size').value;
    let pass = '';

    for (let i = 0; i < size; i++) {
        const condicion = condiciones[Math.floor(Math.random() * condiciones.length)];
        pass += obtenerCaracter(condicion);
    }
    document.getElementById('pass').value = pass;
}