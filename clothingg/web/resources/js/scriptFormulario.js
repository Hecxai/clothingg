/*
 Autor: Griselda Medina Avendaño
 Fecha de creación: 28 de marzo del 2022
 Fecha de actualización:  
 Descripción: script de formulario
 */


function validarDatos() {
    const edad = document.getElementById("edad");
    const form = document.getElementById("formGuardar");
    const parrafo = document.getElementById("warnings");
    const nombre = document.getElementById("name");
    const contrasenia = document.getElementById("password");
    const sexo = document.getElementById("sexo");

    let warnings = "";
    let entrar = false;
    let vacios = false;

    parrafo.innerHTML = "";
    if (nombre.value === "" || contrasenia.value === "" || sexo.value === "" || edad.value === "") {
        vacios = true;
    }
    if (vacios) {
        warnings += 'Rellene todos los campos';
        parrafo.innerHTML = warnings;
        return false;
    } else {
        if (nombre.value.length < 3) {
            warnings += 'El nombre no es válido<br>';
            entrar = true;
        }

        if (contrasenia.value.length < 8) {
            warnings += 'La contraseña debe tener al menos 8 caracteres<br>';
            entrar = true;
        }

        if (!(sexo.value === "masculino" || sexo.value === "femenino")) {
            warnings += 'Sexo no válido <br>';
            entrar = true;
        }

        if (edad.value < 18) {
            warnings += 'La edad no es válida <br>';
            entrar = true;
        }

        if (entrar) {
            parrafo.innerHTML = warnings;
            return false;
        } else {
            parrafo.innerHTML = "Enviado";

            return true;
            ;
        }
    }
}

