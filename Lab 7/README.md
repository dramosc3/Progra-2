# Repaso Módulo III – Programación II

Laboratorio de repaso tipo examen final. Tres APIs REST con **Java 17, Spring Boot 3 y Maven**, organizadas por capas, con datos en memoria, validaciones, manejo de excepciones, pruebas unitarias y protección con API Key.

| Ejercicio | Carpeta | Recurso | Campo de filtro | Rama |
|-----------|---------|---------|-----------------|------|
| 1 | `ejercicio1-profesores` | `/api/profesores` | `especialidad` | `feature/ejercicio-1-profesores` |
| 2 | `ejercicio2-proveedores` | `/api/proveedores` | `categoria` | `feature/ejercicio-2-proveedores` |
| 3 | `ejercicio3-empleados` | `/api/empleados` | `especialidad` | `feature/ejercicio-3-empleados` |

Cada ejercicio es un proyecto Maven independiente (su propio `pom.xml`).

## Estructura por capas

```
src/main/java/com/lab/<recurso>/
├── controller/   # Endpoints REST y códigos HTTP
├── service/      # Lógica de negocio
├── repository/   # Lista en memoria (CopyOnWriteArrayList + AtomicLong para el id)
├── model/        # Entidad (record) y enum Estado (ACTIVO / INACTIVO)
├── dto/          # Request con validaciones (Bean Validation)
├── exception/    # Excepción de "no encontrado" + @RestControllerAdvice
├── security/     # ApiKeyInterceptor (valida el header X-API-KEY)
└── config/       # WebConfig: registra el interceptor en /api/**
```

## Ejecutar

```bash
cd ejercicio1-profesores          # o ejercicio2-proveedores / ejercicio3-empleados
mvn test                          # pruebas unitarias
mvn spring-boot:run               # arranca en http://localhost:8080
```

La API Key por defecto es `clave-secreta-lab-123` (propiedad `app.security.api-key`; se puede cambiar con la variable de entorno `API_KEY`).

## Endpoints (ejemplo con profesores)

| Método | URL | Respuestas |
|--------|-----|-----------|
| POST | `/api/profesores` | 201 Created · 400 datos inválidos · 401 sin API Key |
| GET | `/api/profesores` | 200 OK (lista) |
| GET | `/api/profesores?especialidad=Matemática` | 200 OK (lista filtrada) |
| GET | `/api/profesores/{id}` | 200 OK · 404 Not Found |

```bash
# Crear
curl -i -X POST http://localhost:8080/api/profesores \
  -H "X-API-KEY: clave-secreta-lab-123" -H "Content-Type: application/json" \
  -d '{"nombre":"Ana","apellido":"López","correo":"ana@universidad.edu","especialidad":"Matemática"}'

# Listar y filtrar
curl -i -H "X-API-KEY: clave-secreta-lab-123" "http://localhost:8080/api/profesores?especialidad=Matemática"

# Por id (404 si no existe)
curl -i -H "X-API-KEY: clave-secreta-lab-123" http://localhost:8080/api/profesores/1

# Sin API Key -> 401
curl -i http://localhost:8080/api/profesores
```

Para los otros ejercicios cambie `profesores` por `proveedores` / `empleados` (y `especialidad` por `categoria` en proveedores).

## Validaciones

- `nombre`, `apellido` y el campo de filtro (`especialidad` / `categoria`): no pueden estar vacíos.
- `correo`: obligatorio y con formato válido.
- `estado`: opcional (`ACTIVO` por defecto).

## Pruebas

- `*ServiceTest` (JUnit 5 + Mockito): crear, obtener existente, obtener inexistente.
- `*ControllerTest` (MockMvc): 401 sin/incorrecta API Key, 201 al crear, 400 con nombre vacío o correo inválido, 404 inexistente.

## Flujo de Git (Git Bash)

```bash
git checkout -b feature/ejercicio-1-profesores
# ... trabajar, probar con mvn test ...
git add .
git commit -m "feat: descripcion clara del cambio"
git checkout main
git merge --no-ff feature/ejercicio-1-profesores
git push -u origin main --all
```
