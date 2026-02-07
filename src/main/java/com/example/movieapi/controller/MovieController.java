package com.example.movieapi.controller;

import com.example.movieapi.model.Movie;
import com.example.movieapi.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "http://localhost:5173")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie) {
        return ResponseEntity.ok(service.addMovie(movie));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id) {
        return service.getMovieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
