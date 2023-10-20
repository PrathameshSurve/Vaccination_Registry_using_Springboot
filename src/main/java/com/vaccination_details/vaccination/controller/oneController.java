package com.vaccination_details.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaccination_details.vaccination.model.userDetails;
import com.vaccination_details.vaccination.service.servicesIMPL;

@Controller
public class oneController {

    @Autowired
    private servicesIMPL userService;

    // @GetMapping("/index")
    // public String getIndex() {
    // return "index";
    // }

    @GetMapping("/index")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userDetails", new userDetails());
        return "index";
    }

    @PostMapping("/registrationSuccessful")
    public String signUpSuccessful(@ModelAttribute userDetails user) {
        userService.addUser(user);

        return "registrationSuccessful";
    }

}
