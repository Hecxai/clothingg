/*
 Autor: Griselda Medina Avendaño
 Fecha de creación: 20 de marzo del 2022
 Fecha de actualización:  
 Descripción: script de formulario
 */
function confirmar(codigo)
{
    var opcion = confirm("¿Desea eliminar el usuario?");
    if (opcion == true) {
        location.href = "EliminarUsuarioServlet?codigo=" + codigo;
    } else {
        return false;
    }
}


function cambiarModo() {
    var cuerpoweb = document.body;
    cuerpoweb.classList.toggle("oscuro");
}