# Consumo de API con Spring Boot

Este proyecto muestra cómo consumir una API externa utilizando Spring Boot y `RestTemplate`, realizando operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la API pública de [JSONPlaceholder](https://jsonplaceholder.typicode.com).

## Endpoints

- **GET** `/api/post`: Obtiene todos los posts del usuario con ID 1.
- **GET** `/api/post/{id}`: Obtiene un post por ID.
- **POST** `/api/post`: Crea un nuevo post.
- **PUT** `/api/post/{id}`: Actualiza un post existente.
- **DELETE** `/api/post/{id}`: Elimina un post por ID.

## Tecnologías

- **Spring Boot**
- **RestTemplate** para consumir la API externa.


