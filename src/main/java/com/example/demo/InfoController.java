package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class InfoController {
    List<Movie> movies = new ArrayList<>();
    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId) {
        return new Movie("123","DDlJ");
    }
    @PostMapping("/movies")
    public void addMovie(@RequestBody Movie movie){
        movies.add(movie);

    }
}
