package com.epam.controllers;

import com.epam.domain.Cat;
import com.epam.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.portlet.ModelAndView.

import java.util.ArrayList;
import java.util.List;

@Controller
public class PagesController {

    private CatService catService;

    @Autowired
    public PagesController(CatService catService) {
        this.catService = catService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/pages/hello.html");
        modelAndView.addObject(new Object());
        return modelAndView;
//        return ("index");
    }

//    @RequestMapping(value = "/cat_list_page", method = RequestMethod.GET)
//    public ModelAndView catListPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("cat_list_page");
//        List<Cat> cats = new ArrayList<>();
//        cats.add(Cat.builder().id(1L).name("lala").build());
//        cats.add(Cat.builder().id(2L).name("kola").build());
//        modelAndView.addObject("cats", (cats));
////        modelAndView.addObject("cats", (List<Cat>)catService.getAll());
//        return modelAndView;
//    }

    @RequestMapping(value = "/cat", method = RequestMethod.GET)
    public ModelAndView catPage(@ModelAttribute("catId") long catId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cat_page");
        modelAndView.addObject("cat", (List<Cat>)catService.get(catId));
        return modelAndView;
    }
}
