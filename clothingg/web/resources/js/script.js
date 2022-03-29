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