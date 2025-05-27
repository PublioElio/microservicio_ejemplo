# Microservicio de Bienvenida con Spring Boot
Este proyecto es un microservicio **REST** desarrollado con **Spring Boot**, que expone un endpoint para saludar a los usuarios.

## Características:

- Implementado en **Spring Boot 3.5.0.**
- Uso de **Spring Web** para la gestión de peticiones HTTP.
- Servidor embebido **Tomcat**.
- Retorno de respuestas en **JSON** y **texto plano** según el endpoint.
- Configuración personalizable mediante `application.properties`.

## 🏗️ Estructura del proyecto

El proyecto se organiza en directorios principales:

📂 `src/main/java/com/boot/example/`  
- `WelcomeController.java` → Controlador REST con varios métodos de bienvenida.  
- `ExampleMicroserviceApplication.java` → Punto de entrada de la aplicación.  
- `WelcomeDTO.java` → Clase DTO para las respuestas en JSON. 

📂 `src/main/resources/`  
- `application.properties` → Configuración del servicio.  
- `pom.xml` → Dependencias necesarias. 

📌 Importante: El servicio se ejecutará en el puerto 4000 y tendrá como contexto /myservice.

## Endpoints

### 1️⃣ Mensaje de bienvenida estándar (GET /welcome)

`GET /myservice/welcome`: Devuelve un objeto WelcomeDTO con un mensaje en formato JSON.

#### Ejemplo de solicitud con cURL

```
curl -X GET http://localhost:4000/myservice/welcome
```

#### Respuesta esperada

```
{
    "message": "Welcome to my Spring Boot service"
}
```

### 2️⃣ Mensaje de bienvenida personalizado (GET /welcome/{name})

- Método: GET
- URL: /welcome/{name}

#### Ejemplo de llamada:

```
curl -X GET http://localhost:4000/myservice/welcome/Bruce
```

#### Ejemplo de respuesta:

```
Welcome to my Spring Boot service, Bruce!
```
### 3️⃣ Mensaje de bienvenida con nombre y edad (GET /customgreeting)

- Método: GET
- URL: /myservice/customgreeting?name={name}&age={age}

#### Ejemplo de llamada:

```
curl -X GET "http://localhost:4000/myservice/customgreeting?name=Adriano&age=30"
```

#### Ejemplo de respuesta:

```
Welcome, Adriano you are 30 years old.
```
>Si no se pasan parámetros, el servicio usa valores por defecto (name=Guest, age=42):
```
curl -X GET http://localhost:4000/myservice/customgreeting
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
