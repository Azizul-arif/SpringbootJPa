package com.propertyManagement.propertyManagement.service;

import com.propertyManagement.propertyManagement.dto.PropertyDto;
import com.propertyManagement.propertyManagement.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface PropertyService {

    public PropertyDto saveProperty(PropertyDto propertyDto);
}
