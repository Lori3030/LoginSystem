package com.example.loginsystem.service;


import com.example.loginsystem.repository.dto.UserRegjistartionDto;
import com.example.loginsystem.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    User save (UserRegjistartionDto userRegjistartionDto);
}
