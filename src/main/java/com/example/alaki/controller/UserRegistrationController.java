package com.example.alaki.controller;

import com.example.alaki.dto.UserRegistrationDto;
import com.example.alaki.entity.User;
import com.example.alaki.repository.UserRepository;
import com.example.alaki.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/UserRegistration")
public class UserRegistrationController {

    private final UserService userService;

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return  new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationFrom(Model model){
        model.addAttribute("user", new UserRegistrationDto());
        return "registration";
    }
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){
        User save = userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}
