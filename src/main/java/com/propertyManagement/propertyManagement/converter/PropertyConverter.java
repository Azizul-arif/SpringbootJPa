package com.propertyManagement.propertyManagement.converter;

import com.propertyManagement.propertyManagement.dto.PropertyDto;
import com.propertyManagement.propertyManagement.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {
    public PropertyEntity convertDTOtoEntity(PropertyDto propertyDto)
    {
        PropertyEntity pe=new PropertyEntity();
        pe.setTitle(propertyDto.getTitle());
        pe.setDescription(propertyDto.getDescription());
        pe.setPrice(propertyDto.getPrice());
        pe.setOwnerName(propertyDto.getOwnerName());
        pe.setAddress(propertyDto.getAddress());
        return pe;
    }

    public PropertyDto convertEntitytoDto(PropertyEntity propertyEntity)
    {
        PropertyDto propertyDto =new PropertyDto();
        propertyDto.setId(propertyEntity.getId());
        propertyDto.setTitle(propertyEntity.getTitle());
        propertyDto.setDescription(propertyEntity.getDescription());
        propertyDto.setPrice(propertyEntity.getPrice());
        propertyDto.setOwnerName(propertyEntity.getOwnerName());
        propertyDto.setAddress(propertyEntity.getAddress());
        return propertyDto;

    }
}
