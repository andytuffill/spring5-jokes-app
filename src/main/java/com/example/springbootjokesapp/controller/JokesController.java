package com.example.springbootjokesapp.controller;

import com.example.springbootjokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJokeWithPath(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }


}
