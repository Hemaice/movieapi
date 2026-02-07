package com.example.movieapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Movie {

    private Long id;

    @NotBlank(message = "Movie name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Release year is required")
    private Integer releaseYear;

    public Movie() {}

    public Movie(Long id, String name, String description, Integer releaseYear) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Integer getReleaseYear() { return releaseYear; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }
}
