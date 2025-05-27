# Microservicio de Bienvenida con Spring Boot
Este proyecto es un microservicio **REST** desarrollado con **Spring Boot**, que expone un endpoint para saludar a los usuarios.

## Características:

- Implementado en **Spring Boot 3.5.0.**
- Uso de **Spring Web** para la gestión de peticiones HTTP.
- Servidor embebido **Tomcat**.
- Retorno de respuestas en JSON mediante DTO.

## Estructura del proyecto

El proyecto se organiza en directorios principales:

La carpeta `src/main/java/com/boot/example/` contiene las clases:
- `WelcomeControler.java` (controlador REST).
- `ExampleMicroserviceApplication.java` (punto de entrada).
- `WelcomeDTO.java` (transferencia de datos).

El archivo `application.properties` dentro de `src/main/resources/` configura el servidor.

El archivo `pom.xml` contiene las dependencias necesarias.

## Endpoints

`GET /welcome`: Devuelve un objeto WelcomeDTO con un mensaje en formato JSON.

### Ejemplo de solicitud con cURL

```
curl -X GET http://localhost:4000/welcome
```

#### Respuesta esperada

```
{
    "message": "Welcome to my Spring Boot service"
}
```

## Requisitos previos

Se requiere Java 17 y Maven instalado para ejecutar el proyecto.

## Configuración y ejecución

1. Clonar el repositorio desde GitHub.

```
git clone https://github.com/PublioElio/microservicio_ejemplo.git
```

2. Entrar al directorio del proyecto.

```
cd microservicio_ejemplo
```

4. Compilar y ejecutar

```
mvn spring-boot:run
```

## Dependencias
El proyecto usa `Spring Boot Starter Web` para manejar peticiones HTTP:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

>Notas: Si el puerto 4000 está ocupado, se puede cambiar en el archivo `application.properties` agregando `server.port=9090`.

Licencia: Este proyecto es de código abierto bajo la licencia MIT.
