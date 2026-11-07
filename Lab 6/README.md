# Laboratorio: APIs REST con OpenAPI y Spring Boot

Proyecto con los 6 ejercicios del laboratorio, usando **Maven** y **Spring Boot 3.3** (Java 17 o superior).

## Estructura

```
laboratorio-apis/
├── disenio/                          <- Ejercicios 1 a 3 (Swagger / OpenAPI 3.0)
│   ├── ejercicio1-libros.yaml
│   ├── ejercicio2-cursos.yaml
│   └── ejercicio3-reservas.yaml
├── ejercicio4-api-libros/            <- Implementación del ejercicio 1 (puerto 8081)
├── ejercicio5-api-cursos/            <- Implementación del ejercicio 2 (puerto 8082)
└── ejercicio6-api-reservas/          <- Implementación del ejercicio 3 (puerto 8083)
```

Cada proyecto Spring Boot está organizado por capas:

```
controller/   Endpoints REST (reciben y responden JSON)
service/      Lógica de negocio y validaciones de reglas
repository/   Almacenamiento en memoria (listas)
model/        Entidades del dominio y enums
dto/          Request y Response (lo que entra y sale por la API)
exception/    Excepciones propias y manejador global de errores
```

## Cómo ejecutar

Desde la carpeta de cada ejercicio:

```bash
mvn spring-boot:run
```

O abrir la carpeta en IntelliJ IDEA / Eclipse / VS Code como proyecto Maven y ejecutar la clase `*Application`.

Cada API incluye Swagger UI generado automáticamente:

| Ejercicio | API | Swagger UI |
|-----------|-----|------------|
| 4 | Libros | http://localhost:8081/swagger-ui.html |
| 5 | Cursos | http://localhost:8082/swagger-ui.html |
| 6 | Reservas | http://localhost:8083/swagger-ui.html |

Cada carpeta trae una colección de Postman en `postman/` (Import → seleccionar el `.json`). Incluye los casos exitosos y los de error, y cada petición verifica su código HTTP esperado. Ejecútalas en orden (botón *Run collection*) con la API recién iniciada, porque dependen de que el id 1 exista.

Los archivos de `disenio/` se pueden abrir pegándolos en https://editor.swagger.io.

## Endpoints

### Libros (`/api/v1/libros`)
| Operación | Método y ruta | Éxito | Errores |
|-----------|---------------|-------|---------|
| Registrar | `POST /api/v1/libros` | 201 | 400, 409 (ISBN duplicado) |
| Consultar todos | `GET /api/v1/libros` | 200 | - |
| Consultar por título | `GET /api/v1/libros/titulo/{titulo}` | 200 | 404 |
| Actualizar | `PUT /api/v1/libros/{id}` | 200 | 400, 404, 409 |
| Eliminar | `DELETE /api/v1/libros/{id}` | 204 | 404 |

Campos: `id, titulo, autor, isbn, anioPublicacion, estado` (`DISPONIBLE | PRESTADO | EN_REPARACION`).

### Cursos (`/api/v1/cursos`)
| Operación | Método y ruta | Éxito | Errores |
|-----------|---------------|-------|---------|
| Crear | `POST /api/v1/cursos` | 201 | 400, 409 (código duplicado) |
| Consultar todos | `GET /api/v1/cursos` | 200 | - |
| Consultar por código | `GET /api/v1/cursos/codigo/{codigo}` | 200 | 404 |
| Actualizar | `PUT /api/v1/cursos/{id}` | 200 | 400, 404, 409 |
| Eliminar | `DELETE /api/v1/cursos/{id}` | 204 | 404 |

Campos: `id, nombre, codigo, creditos, estado` (`ACTIVO | INACTIVO`).

### Reservas (`/api/v1/reservas`)
| Operación | Método y ruta | Éxito | Errores |
|-----------|---------------|-------|---------|
| Crear | `POST /api/v1/reservas` | 201 | 400, 409 (habitación ocupada) |
| Consultar todas | `GET /api/v1/reservas` | 200 | - |
| Consultar por id | `GET /api/v1/reservas/{id}` | 200 | 404 |
| Actualizar | `PUT /api/v1/reservas/{id}` | 200 | 400, 404, 409 |
| Cancelar | `PATCH /api/v1/reservas/{id}/cancelar` | 200 | 404, 409 (ya cancelada) |

Campos: `id, nombreCliente, habitacion, fechaEntrada, fechaSalida, estado` (`CONFIRMADA | CANCELADA`).
Las fechas van en formato `yyyy-MM-dd`. La reserva nueva siempre queda `CONFIRMADA`.

## Formato de error (todas las APIs)

```json
{
  "timestamp": "2026-09-18T10:15:30",
  "status": 404,
  "error": "Not Found",
  "mensaje": "No existe un libro con id 99",
  "detalles": []
}
```

## Notas de diseño

- Los datos se guardan en listas en memoria: se pierden al reiniciar la aplicación.
- `PUT` reemplaza todos los campos del recurso (se deben enviar todos).
- Los ISBN se guardan sin guiones y los códigos de curso en mayúsculas para detectar duplicados.
- Para registrar en Git: cada carpeta de ejercicio trae su `.gitignore` (excluye `target/`).
