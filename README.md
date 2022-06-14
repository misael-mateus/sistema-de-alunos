# Argonauts

- REST API

## Stack

- Gradle
- Java
- Spring Boot
- MySQL

## Port

- default port 8080

## Endpoints

- POST /argonauts -> create
- GET /argonauts -> getAll
- GET /argonauts/{id} -> get
- PUT /argonauts/{id} -> update
- DELETE /argonauts/{id} -> delete
- GET /argonauts/{active} -> getByStatus

## Model

``` json
student {
  "id": "Long",
  "name": "String",
  "identityNumber": "String",
  "studentSince": "LocalDate",
  "birthDate": "LocalDate",
  "cellphone": "Long",
  "email": "String",  
  "postalCode": "String",
  "addressLine": "String",
  "monthlyBill": "double",
  "lastPayDate": "LocalDate"
}
```

# Continua