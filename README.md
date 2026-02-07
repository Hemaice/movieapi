# Movie Management REST API

This is a simple Spring Boot REST API for managing movies (similar to Netflix).

## Features
- Add a new movie
- Get a movie by ID
- In-memory data storage (ArrayList)
- Input validation using Jakarta Validation

## Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Jakarta Validation

## How to Run Locally
1. Clone the repository
2. Run `mvn spring-boot:run`
3. Application runs on `http://localhost:8080`

## API Endpoints

### Add Movie
POST /api/movies

Request Body:
```json
{
  "name": "Inception",
  "description": "Sci-fi thriller",
  "releaseYear": 2010
}
