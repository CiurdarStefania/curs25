package ro.fasttrackit.curs25movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Curs25MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs25MoviesApplication.class, args);
	}
	@Bean
	CommandLineRunner atStartup(MovieRepository repo) {
		return args -> repo.saveAll(List.of(
				new Movie("The Shawshank Redemption", 1994, 9.2),
				new Movie("The Godfather", 1972, 9.1),
				new Movie("The Godfather: Part II 3.", 1974, 9.0),
				new Movie("The Dark Knight", 2008, 9.0)
		));
	}
}
