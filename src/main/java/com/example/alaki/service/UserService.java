package com.example.alaki.service;

import com.example.alaki.dto.UserRegistrationDto;
import com.example.alaki.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
