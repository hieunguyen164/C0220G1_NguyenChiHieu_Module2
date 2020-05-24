package com.codegym.controller;

import com.codegym.service.UserService;
import com.codegym.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/index");
            return modelAndView;
        }
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("message","New account has been created successfully.");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView showList(){
        Iterable<User> users = userService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("users",users);
        return modelAndView;
    }
}
