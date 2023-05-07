# Sistema de Gestión de Préstamo de Libros

## Descripción
Este proyecto es un sistema de gestión de préstamo de libros para una biblioteca. Permite a los usuarios realizar consultas sobre libros disponibles, solicitar préstamos, devolver libros y administrar su cuenta de usuario.

## Instalación
A continuación se detallan los pasos para instalar y ejecutar el proyecto:

1. Clona el repositorio en tu máquina local: 

``` 
git clone https://github.com/kevinbayter/gestor_de_libros 
```

2. Navega al directorio del proyecto:


3. Instala las dependencias:


4. Configura la conexión a la base de datos en el archivo `.env`.

5. Inicia la aplicación:



6. Accede a la aplicación a través de tu navegador web en la siguiente dirección: `http://localhost:3000`

## Uso

### Endpoints

A continuación se describen los endpoints disponibles en el proyecto:

- **GET /libros**
    - Descripción: Obtiene todos los libros disponibles en la biblioteca.
    - Ejemplo de respuesta:
      ```
      [
        {
          "id": 1,
          "titulo": "El gran Gatsby",
          "autor": "F. Scott Fitzgerald",
          "disponible": true
        },
        {
          "id": 2,
          "titulo": "Cien años de soledad",
          "autor": "Gabriel García Márquez",
          "disponible": false
        },
        ...
      ]
      ```

- **POST /prestamos**
    - Descripción: Solicita un préstamo de un libro.
    - Ejemplo de solicitud:
      ```
      {
        "usuarioId": 1,
        "libroId": 1,
        "fechaPrestamo": "2023-05-08",
        "fechaDevolucion": "2023-05-15"
      }
      ```
    - Ejemplo de respuesta:
      ```
      {
        "id": 1,
        "usuarioId": 1,
        "libroId": 1,
        "fechaPrestamo": "2023-05-08",
        "fechaDevolucion": "2023-05-15"
      }
      ```

- **PUT /prestamos/{id}/devolucion**
    - Descripción: Marca un préstamo como devuelto.
    - Parámetros de ruta: `id` - ID del préstamo.
    - Ejemplo de respuesta:
      ```
      {
        "id": 1,
        "usuarioId": 1,
        "libroId": 1,
        "fechaPrestamo": "2023-05-08",
        "fechaDevolucion": "2023-05-15",
        "devuelto": true
      }
      ```

## Contribución
### Kevin Bayter ->  [website](http://bcod3r.com)


