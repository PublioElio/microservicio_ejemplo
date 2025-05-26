# Microservicio de Bienvenida con Spring Boot
Este proyecto es un microservicio **REST** desarrollado con **Spring Boot**, que expone un endpoint para saludar a los usuarios.
## Características:
- Implementado en **Spring Boot 3.5.0.**
- Uso de **Spring Web** para la gestión de peticiones HTTP.
- Servidor embebido **Tomcat**.
- Retorno de respuestas en **JSON** o **texto plano**.

## Estructura del proyecto 
El proyecto se organiza en directorios principales:

La carpeta `src/main/java/com/boot/ejemplo/` contiene las clases `BienvenidaController.java` y `MicroservicioEjemploApplication.java`.

El archivo `application.properties` dentro de `src/main/resources/` configura el servidor.

El archivo pom.xml contiene las dependencias necesarias.

Endpoints:

Método GET en /bienvenida, que devuelve un mensaje de bienvenida.

Ejemplo de solicitud con cURL:

bash
curl -X GET http://localhost:8080/bienvenida
Configuración y ejecución:

Clonar el repositorio desde GitHub.

Entrar al directorio del proyecto.

Compilar y ejecutar con mvn spring-boot:run.

Dependencias: El proyecto usa Spring Boot Starter Web para manejar peticiones HTTP.

Notas: Si el puerto 8080 está ocupado, se puede cambiar en el archivo application.properties agregando server.port=9090.

Licencia: Este proyecto es de código abierto bajo la licencia MIT.
