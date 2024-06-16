# RepositorioDDBB
Entidades-Relaciones

# Proyecto de Hibernate y Spring Boot

Este proyecto es una aplicación simple que demuestra el uso de Hibernate y Spring Boot para gestionar entidades y relaciones en una base de datos.

## Entidades

Las entidades principales del proyecto son `Person`, `Address`, `Book` y `Course`. Cada `Person` tiene una `Address` (relación uno a uno), puede tener muchos `Book` (relación uno a muchos) y puede estar inscrita en muchos `Course` (relación muchos a muchos).

## Repositorios

Se utilizan repositorios de Spring Data JPA para realizar operaciones de base de datos en las entidades. Los repositorios son `PersonRepository`, `BookRepository` y `CourseRepository`.

## Servicios

Los servicios contienen la lógica de negocio y llaman a los métodos de los repositorios para interactuar con la base de datos. Los servicios son `PersonService`, `BookService` y `CourseService`.

## Ejecución

Para ejecutar el proyecto, puedes usar el método `main` en la clase `BasicjpaApplication`. Este método guarda algunas entidades de prueba en la base de datos y luego recupera y muestra estas entidades para demostrar que las relaciones se han establecido correctamente.

## Notas

Este proyecto es solo un ejemplo y puede necesitar modificaciones para adaptarse a tus necesidades específicas. Por favor, asegúrate de entender cómo funcionan Hibernate y Spring Boot antes de utilizar este código en un entorno de producción.

