# epg-prueba

Esta es la versión que he podido realizar, no me termina de funcionar, por ahora sólo me deja añadir un usuario y leer todos los usuarios, no he conseguido en el tiempo que he tenido poder añadir una conexión entre usuarios ni recuperar dicha conexión.

He tenido problemas con mi ordenador y he tenido que hacerlo en el ordenador de un amigo, por lo que no he disponido de mucho tiempo.

He tenido que informarme de como funciona spring, hibernate y refrescar conocimientos de java y api-rest.

He creado una base de datos mysql con xampp.
He partido de varios tutoriales de internet para construir el proyecto y sus clases
He hecho las pruebas con postman.

Para ejecutarlo lo he desplegado desde eclipse directamente y hecho las pruebas con postman.

Para ver los usuarios:
http://localhost:8080/api/users

Para añadir usuarios: post a http://localhost:8080/api/users/connection  con por ejemplo un json:
{
    "user": "Dani",
    "idUserConnection": "Antonio"
}

el UserConnection no se llega a insertar en la tabla se queda a null y no he tenido tiempo de investigarlo.

Saludos
