package com.propertyManagement.propertyManagement.service.impl;

import com.propertyManagement.propertyManagement.converter.UserConverter;
import com.propertyManagement.propertyManagement.dto.UserDto;
import com.propertyManagement.propertyManagement.entity.UserEntity;
import com.propertyManagement.propertyManagement.repository.UserRepository;
import com.propertyManagement.propertyManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;
    @Override
    public UserDto register(UserDto userDto) {
        UserEntity  userEntity=userConverter.convertDTOtoEntity(userDto);
        userEntity=userRepository.save(userEntity);
        userDto=userConverter.convertEntityToDto(userEntity);
        return userDto;
    }

    @Override
    public UserDto login(String email, String password) {
        UserDto userDto=null;
       Optional<UserEntity> optionalUserEntity = userRepository.findByOwnerEmailAndPassword(email,password);
        if(optionalUserEntity.isPresent())
        {
            userDto=userConverter.convertEntityToDto(optionalUserEntity.get());

        }
        return userDto;
    }
}
