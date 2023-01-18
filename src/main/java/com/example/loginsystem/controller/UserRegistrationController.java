package com.example.loginsystem.controller;


import com.example.loginsystem.repository.dto.UserRegjistartionDto;
import com.example.loginsystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    @ModelAttribute("user")
    public UserRegjistartionDto userRegjistartionDto(){

        return new UserRegjistartionDto();
    }

    @GetMapping
    private String showRegistrationForm(){

        return "registration";
    }
    @PostMapping
    public String regjisterUserAccount(@ModelAttribute("user")UserRegjistartionDto regjistartionDto){
        userService.save(regjistartionDto);
        return "redirect:/registration?success";
    }

}
