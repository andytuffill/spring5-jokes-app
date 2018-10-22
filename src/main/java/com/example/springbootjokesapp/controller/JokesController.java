package com.example.springbootjokesapp.controller;

import com.example.springbootjokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    @RequestMapping("/")
    public String getJokeWithPath(Model model){
        return getJoke(model);
    }

    @RequestMapping("")
    public String getJokeWithNoPath(Model model){
        return getJoke(model);
    }


    private String getJoke(Model model){
        model.addAttribute("joke", getJokeService().getJoke());

        return "chucknorris";
    }


    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public JokeService getJokeService() {
        return jokeService;
    }
}
