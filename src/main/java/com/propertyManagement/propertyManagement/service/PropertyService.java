package com.propertyManagement.propertyManagement.service;

import com.propertyManagement.propertyManagement.dto.PropertyDto;
import com.propertyManagement.propertyManagement.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PropertyService {

    public PropertyDto saveProperty(PropertyDto propertyDto);
    List<PropertyDto> getAllProperties();
}
