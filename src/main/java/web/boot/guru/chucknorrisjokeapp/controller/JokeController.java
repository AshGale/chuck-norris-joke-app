package web.boot.guru.chucknorrisjokeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.boot.guru.chucknorrisjokeapp.web.boot.guru.chucknorrisjokeapp.service.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @GetMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chuckNorris";
    }

}
