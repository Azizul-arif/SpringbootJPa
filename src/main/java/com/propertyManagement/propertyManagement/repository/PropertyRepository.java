package com.propertyManagement.propertyManagement.repository;

import com.propertyManagement.propertyManagement.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {
}
