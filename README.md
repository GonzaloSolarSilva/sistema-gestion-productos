# Sistema de Gestion de Productos

API REST desarrollada con Java y Spring Boot para la gestion completa de productos.

## Tecnologias
- Java 23
- Spring Boot 3.5.15
- Spring Data JPA / Hibernate
- PostgreSQL
- JUnit 5 + Mockito
- Maven

## Endpoints

| Metodo | Endpoint | Descripcion |
|--------|----------|-------------|
| GET | /productos | Listar todos los productos |
| GET | /productos/{id} | Obtener producto por ID |
| POST | /productos | Crear nuevo producto |
| PUT | /productos/{id} | Actualizar producto |
| DELETE | /productos/{id} | Eliminar producto |

## Como ejecutar

1. Clonar el repositorio
2. Configurar PostgreSQL con base de datos productos_db
3. Actualizar credenciales en application.properties
4. Ejecutar con IntelliJ IDEA o Maven

## Tests
Pruebas unitarias implementadas con JUnit 5 y Mockito cubriendo la capa de servicio.
