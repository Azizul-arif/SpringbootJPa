package com.propertyManagement.propertyManagement.service;

import com.propertyManagement.propertyManagement.dto.UserDto;

public interface UserService {
    UserDto register(UserDto userDto);
    UserDto login (String email,String password);

}
