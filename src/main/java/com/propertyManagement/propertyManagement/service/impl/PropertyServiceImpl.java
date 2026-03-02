package com.propertyManagement.propertyManagement.service.impl;

import com.propertyManagement.propertyManagement.converter.PropertyConverter;
import com.propertyManagement.propertyManagement.dto.PropertyDto;
import com.propertyManagement.propertyManagement.entity.PropertyEntity;
import com.propertyManagement.propertyManagement.repository.PropertyRepository;
import com.propertyManagement.propertyManagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropertyServiceImpl  implements PropertyService
{

    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;
    @Override
    public PropertyDto saveProperty(PropertyDto propertyDto)
    {
        PropertyEntity pe = propertyConverter.convertDTOtoEntity(propertyDto);
        pe=propertyRepository.save(pe);
        propertyDto=propertyConverter.convertEntitytoDto(pe);
        return propertyDto;
    }
    @Override
    public List<PropertyDto> getAllProperties()
    {
        List<PropertyDto> propList=new ArrayList<>();
        List<PropertyEntity> propertyEntities = (List<PropertyEntity>) propertyRepository.findAll();
        for(PropertyEntity pe:propertyEntities)
        {
            PropertyDto dto=propertyConverter.convertEntitytoDto(pe);
            propList.add(dto);
        }
        return  propList;
    }
}
