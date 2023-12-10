function contarLetras(cadena) {
    const vocales = ['a', 'e', 'i', 'o', 'u'];
    let contadorVocales = 0;
    let contadorConsonantes = 0;

    for (let i = 0; i < cadena.length; i++) {
        const letra = cadena[i].toLowerCase();

        if (vocales.includes(letra)) {
            contadorVocales++;
        } else if (letra >= 'a' && letra <= 'z') {
            contadorConsonantes++;
        }
    }

    return {vocales: contadorVocales, consonantes: contadorConsonantes};
}

// Uso del script
const cadena = "Hola Jose Maria estoy en el curso de javaScript";
const resultados = contarLetras(cadena);
console.log(`Vocales: ${resultados.vocales}`);
console.log(`Consonantes: ${resultados.consonantes}`);