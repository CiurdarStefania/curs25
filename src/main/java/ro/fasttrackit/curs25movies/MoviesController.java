package ro.fasttrackit.curs25movies;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MoviesController {
    private final MoviesService movieService;

    public MoviesController(MoviesService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("movies")
    public String moviesPage(){
        return "movies";
    }
    @GetMapping("movies")
    public String moviesPage(Model pageModel) {
        pageModel.addAttribute("movies", movieService.getAll());
        return "movies";
    }

    @GetMapping("movies/{id}")
    public String moviesPageWithDetails(@PathVariable Integer id, Model pageModel) {
        pageModel.addAttribute("showDetails", true);
        pageModel.addAttribute("selectedMovie", movieService.getMovie(id));
        return moviesPage(pageModel);
    }

}
