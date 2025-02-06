package com.cinesage.service;

import com.cinesage.model.Movie;
import com.cinesage.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public String addMovie(Movie movie) {
        movieRepository.save(movie);
        return "Movie saved!";
    }

    // search movie by name
    public List<Movie> searchMovie(String searchString) {
        List<Movie> moviesResult = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            if (movie.getMovieName().contains(searchString)) {
                moviesResult.add(movie);
            }
        }
        return moviesResult;
    }

    // search movie by genre
    public List<Movie> searchMovieByGenre(String genreString) throws Exception {
        List<Movie> moviesResult = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {

            // write condition
            if (true) {
                moviesResult.add(movie);
            }
        }
        if (moviesResult.size() > 0) {
            return moviesResult;
        } else {
            throw new Exception("No movie found!");
        }
    }

}
