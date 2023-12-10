function validacion() {
    const nombre = document.getElementById("nombre").value;
    const edad = document.getElementById("edad").value;
    const email = document.getElementById("e-mail").value;

    if (nombre.length > 3) {
        alert("El nombre tiene más de 3 caracteres");
        return false;
    }
    if (edad < 0 || edad > 120) {
        alert("La edad debe estar entre 0 y 120");
        return false;
    }
    const regexEmail = /^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$/;
    if (!regexEmail.test(email)) {
        alert("El email no es válido");
        return false;
    }
    return true;
}