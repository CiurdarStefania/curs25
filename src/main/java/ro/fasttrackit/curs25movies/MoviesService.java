package ro.fasttrackit.curs25movies;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {
    private final MovieRepository movieRepository;

    public MoviesService(final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public Movie getMovie(final Integer id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not find movie with id " + id));
    }
}
