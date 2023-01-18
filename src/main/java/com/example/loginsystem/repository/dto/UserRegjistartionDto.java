package com.example.loginsystem.repository.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRegjistartionDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserRegjistartionDto() {

    }
}

