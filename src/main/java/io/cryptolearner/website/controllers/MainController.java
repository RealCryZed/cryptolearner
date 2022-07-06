package io.cryptolearner.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");

        return mv;
    }

    @GetMapping("/about-us")
    public ModelAndView aboutUs() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("about-us");

        return mv;
    }

    @GetMapping("/our-goal")
    public ModelAndView ourGoal() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("our-goal");

        return mv;
    }
}
