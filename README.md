# Project - *Notes REST API*

By: **Alfredo Benites**

**Notes REST API** is a backend application built with **Java** and **Spring Boot** that allows users to **create, read, update, and delete (CRUD)** notes through RESTful API endpoints.  
The project also includes **JUnit 5 tests** to ensure core functionality works as expected.

Time spent: **4.5 hours** spent in total

## Features

The following functionality is completed:

- [x] User can view all notes using `GET /notes`
- [x] User can add a new note using `POST /notes`
- [x] User can update a note using `PUT /notes/{id}`
- [x] User can delete a note using `DELETE /notes/{id}`
- [x] Application tested with **JUnit 5** for service logic

The following **additional** features are implemented:

- [x] Clean architecture following Controller–Service–Model structure
- [x] Easy to test and extend for future functionality

## Notes

This was my first full Spring Boot project. I learned how to:
  - Build REST APIs using Spring annotations (@RestController, @GetMapping, @PostMapping, @DeleteMapping, @PutMapping, @RequestBody, and @PathVariable)
  - Write and run JUnit 5 tests for logic validation
  - Use dependency injection with @Service
  - Structure a professional backend project using Maven

## Run Locally

Make sure you have **Java 21** and **Maven** installed.  
Then, clone the repository and run the app:

```bash
git clone https://github.com/YOUR_USERNAME/notes-app.git
cd notes-app
./mvnw spring-boot:run
```

You can test the API using IntelliJ’s HTTP client, Postman, or curl.

Example request:

GET http://localhost:8080/notes

## Tech Stack

**Language**: Java

**Framework**: Spring Boot

**Testing**: JUnit 5

**Build Tool**: Maven

**IDE**: IntelliJ IDEA Ultimate

**Version Control**: Git + GitHub
