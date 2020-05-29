package ro.fasttrackit.curs25movies;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
