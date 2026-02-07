package com.example.movieapi.service;

import com.example.movieapi.model.Movie;
import com.example.movieapi.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public Movie addMovie(Movie movie) {
        return repository.save(movie);
    }

    public Optional<Movie> getMovieById(Long id) {
        return repository.findById(id);
    }
}
