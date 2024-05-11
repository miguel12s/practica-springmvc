package com.miguel.cursospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("title", "i am the title");
        model.addAttribute("greetings", "hi miguel ");
        model.addAttribute("show", true);
        return "index";
    }

    @RequestMapping(value = "/index-request-mapping", method = RequestMethod.GET)

    public String indexRequestMapping() {
        return "index";
    }


    @GetMapping(value = "indexmv")
    public ModelAndView indexMV(ModelAndView mv) {
        mv.addObject("title", "i am the title");
        mv.addObject("greetings", "hi miguel ");
        mv.addObject("show", true);
        mv.setViewName("index");
        return mv;
    }
    @ModelAttribute("series")
    public List<String> getSeries(){
        return List.of("batman","robin","ironman");
    }

}
