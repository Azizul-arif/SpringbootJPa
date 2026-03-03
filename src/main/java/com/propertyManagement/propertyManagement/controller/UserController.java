package com.propertyManagement.propertyManagement.controller;

import com.propertyManagement.propertyManagement.dto.UserDto;
import com.propertyManagement.propertyManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto)
    {
         userDto=userService.register(userDto);
         return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody UserDto userDto)
    {
        userDto=userService.login(userDto.getOwnerEmail(),userDto.getPassword());
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
