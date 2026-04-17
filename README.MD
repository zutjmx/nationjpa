# nationjpa

Aplicación Spring Boot mínima para gestionar continentes mediante JPA y una API REST.

## Funcionalidad actual

- Exposición de una API REST bajo `/api/continents`.
- Endpoint `GET /api/continents` para listar todos los continentes almacenados.
- Endpoint `GET /api/continents/{id}` para consultar un continente por su identificador.
- Si el continente no existe, el endpoint devuelve `404 Not Found`.

## Modelo de datos

- `Continent` es la entidad principal.
- Se mapea a la tabla `continents` con columnas:
  - `continent_id` (clave primaria)
  - `name`

## Arquitectura

- `ContinentController` maneja las solicitudes HTTP.
- `ContinentService` y `ContinentServiceImpl` encapsulan la lógica de negocio.
- `ContinentRepository` extiende `CrudRepository<Continent, Long>` para operaciones CRUD básicas.

## Configuración

- La aplicación usa Spring Data JPA y MariaDB.
- Variables de entorno necesarias:
  - `DB_URL_NATION`
  - `DB_USER_SKY`
  - `DB_PASSWORD_SKY`
- El driver JDBC configurado es `org.mariadb.jdbc.Driver`.

## Ejecución

1. Configura las variables de entorno del datasource.
2. Ejecuta el proyecto con Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
3. Accede a los endpoints REST:
   - `http://localhost:8080/api/continents`
   - `http://localhost:8080/api/continents/{id}`

## Notas

- El servicio incluye métodos adicionales en `ContinentService` para guardar, actualizar y eliminar continentes, aunque actualmente el controlador solo expone la lectura.
- El método `findContinentByName` aún no está implementado en `ContinentServiceImpl`.
