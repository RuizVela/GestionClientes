# Prueba Técnica - CRUD para Clientes

Esta es una prueba técnica para evaluar conocimientos en **Maven** y **Spring Boot**. El objetivo principal es implementar un **CRUD** básico para gestionar clientes utilizando una base de datos H2 persistente.

## Tareas

1. **Crear un CRUD para la entidad `Cliente`**:
    
    - La entidad `Cliente` debe tener al menos los siguientes atributos: `id`, `nombre`, y `email`.  
    - Implementar los métodos para crear, leer, actualizar y eliminar clientes.

2. **Implementar Pruebas Unitarias**:
    
    - Escribir pruebas unitarias para verificar el correcto funcionamiento de las operaciones CRUD.  
    - Utilizar **JUnit 5** y **Mockito** para probar los servicios y controladores.  
    - Asegurarse de que las operaciones con la base de datos y las validaciones funcionen correctamente.


## Estructura del Proyecto

- **`application.properties`**: Configuración de la base de datos y parámetros de Spring Boot.
- **`entities/ClienteEntity.java`**: Entidad que representa a un cliente.
- **`repositories/ClienteRepository.java`**: Repositorio JPA para la entidad `Cliente`.
- **`services/ClienteService.java`**: Lógica de negocio para las operaciones CRUD.
- **`application/GestionClientesApplication.java`**: Clase principal para arrancar la aplicación.

Este proyecto está diseñado para evaluar cómo gestionar la persistencia de datos, la creación de endpoints RESTful y las pruebas unitarias en un proyecto basado en **Spring Boot**.
