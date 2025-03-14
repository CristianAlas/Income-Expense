# Backend ExpenseTracker

ExpenseTracker es una aplicación Spring Boot diseñada para ayudar a los usuarios a 
gestionar sus finanzas mediante el seguimiento de gastos e ingresos. Este backend 
proporciona una API RESTful para administrar transacciones financieras, ver estadísticas y generar datos gráficos.

## Tabla de Contenidos
- [Características](#características)
- [Tecnologías](#tecnologías)
- [Primeros Pasos](#primeros-pasos)
  - [Requisitos Previos](#requisitos-previos)
  - [Instalación](#instalación)
  - [Configuración](#configuración)
- [Documentación de la API](#documentación-de-la-api)
  - [API de Gastos](#api-de-gastos)
  - [API de Ingresos](#api-de-ingresos)
  - [API de Estadísticas](#api-de-estadísticas)
- [Estructura de la Base de Datos](#estructura-de-la-base-de-datos)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## Características

- Seguimiento y gestión de gastos con categorización
- Registro y categorización de fuentes de ingresos
- Obtención de estadísticas financieras completas
- Generación de datos gráficos para análisis financiero
- Operaciones CRUD completas para gastos e ingresos
- Manejo de errores con códigos de estado HTTP apropiados

## Tecnologías

- **Java 21+**
- **Spring Boot**: Framework de aplicación
- **Spring Data JPA**: Persistencia de datos
- **Spring Web**: Desarrollo de API RESTful
- **Lombok**: Reduce código repetitivo
- **Swagger/OpenAPI**: Documentación de API
- **H2/MySQL/PostgreSQL**: Base de datos (configurable según necesidad)

## Primeros Pasos

### Requisitos Previos

- Java 11 o superior
- Maven
- Tu base de datos preferida (configurada en application.properties)

### Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/expense-tracker.git
   cd expense-tracker
   ```

2. Construye el proyecto:
   ```bash
   mvn clean install
   ```

3. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```

### Configuración

La aplicación utiliza propiedades de Spring Boot para la configuración. Crea o modifica `src/main/resources/application.properties` para configurar:

```properties
# Configuración del servidor
server.port=8080

# Configuración de la base de datos (ejemplo para MySQL)
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=password

# Propiedades de Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Configuración de CORS
# En producción, reemplazar con el dominio apropiado
```

## Documentación de la API

La documentación de la API está disponible a través de Swagger UI después de iniciar la aplicación:
```
http://localhost:8080/swagger-ui/index.html
```

### API de Gastos

URL Base: `/api/expense`

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| POST | `/` | Crear un nuevo gasto |
| GET | `/all` | Obtener todos los gastos |
| GET | `/{id}` | Obtener gasto por ID |
| PUT | `/{id}` | Actualizar un gasto existente |
| DELETE | `/{id}` | Eliminar un gasto |

#### Estructura del DTO de Gasto

```json
{
  "id": 1,
  "title": "Compra de Supermercado",
  "description": "Compra semanal",
  "category": "Alimentación",
  "date": "2023-03-15",
  "amount": 8500
}
```

### API de Ingresos

URL Base: `/api/income`

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| POST | `/` | Crear un nuevo registro de ingreso |
| GET | `/all` | Obtener todos los registros de ingresos |
| GET | `/{id}` | Obtener registro de ingreso por ID |
| PUT | `/{id}` | Actualizar un registro de ingreso existente |
| DELETE | `/{id}` | Eliminar un registro de ingreso |

#### Estructura del DTO de Ingreso

```json
{
  "id": 1,
  "title": "Salario",
  "description": "Salario mensual",
  "category": "Empleo",
  "date": "2023-03-01",
  "amount": 350000
}
```

### API de Estadísticas

URL Base: `/api/stats`

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/` | Obtener estadísticas financieras generales |
| GET | `/chart` | Obtener datos para representación gráfica |

#### Estructura del DTO de Estadísticas

```json
{
  "income": 450000.0,
  "expense": 125000.0,
  "latestIncome": { /*objeto ingreso*/ },
  "latestExpense": { /*objeto gasto*/ },
  "balance": 325000.0,
  "minIncome": 10000.0,
  "maxIncome": 350000.0,
  "minExpense": 500.0,
  "maxExpense": 50000.0
}
```

## Estructura de la Base de Datos

La aplicación utiliza dos entidades principales:

### Entidad Expense (Gasto)
- `id`: Long (Clave Primaria)
- `title`: String
- `description`: String
- `category`: String
- `date`: LocalDate
- `amount`: Integer

### Entidad Income (Ingreso)
- `id`: Long (Clave Primaria)
- `title`: String
- `description`: String
- `category`: String
- `date`: LocalDate
- `amount`: Integer

## Contribuir

1. Haz un fork del repositorio
2. Crea una rama para tu función (`git checkout -b feature/nueva-funcionalidad`)
3. Haz commit de tus cambios (`git commit -m 'Agregar nueva funcionalidad'`)
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre una Pull Request

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo LICENSE para más detalles.
