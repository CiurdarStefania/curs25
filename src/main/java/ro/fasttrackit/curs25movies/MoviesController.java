package ro.fasttrackit.curs25movies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoviesController {
    @GetMapping("movies")
    public String moviesPage(){
        return "movies";
    }

}
