package com.propertyManagement.propertyManagement.converter;

import com.propertyManagement.propertyManagement.dto.UserDto;
import com.propertyManagement.propertyManagement.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserDto convertEntityToDto(UserEntity userEntity)
    {
        UserDto userDto=new UserDto();
        userDto.setOwnerName(userEntity.getOwnerName());
        userDto.setOwnerEmail(userEntity.getOwnerEmail());
        userDto.setPhone(userEntity.getPhone());
        userDto.setPassword(userEntity.getPassword());
        return userDto;

    }

    public UserEntity convertDTOtoEntity(UserDto userDto)
    {
        UserEntity userEntity=new UserEntity();
        userEntity.setOwnerName(userDto.getOwnerName());
        userEntity.setOwnerEmail(userDto.getOwnerEmail());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setPassword(userDto.getPassword());
        return userEntity;
    }
}
