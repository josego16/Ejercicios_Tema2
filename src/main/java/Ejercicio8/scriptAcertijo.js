const num1 = Math.floor(Math.random() * 100);
const num2 = Math.floor(Math.random() * 100);
const resultado = num1 + num2;

document.getElementById("acertijo").innerText = `${num1} + ${num2} = ?`;

function checkSolution() {
    const userRespuesta = document.getElementById("respuesta").value;

    if (userRespuesta == resultado) {
        document.getElementById("resultado").innerHTML = "¡Correcto!";
    } else {
        document.getElementById("resultado").innerHTML = "¡Incorrecto!";
    }
}
