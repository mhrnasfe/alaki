package com.example.alaki.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
