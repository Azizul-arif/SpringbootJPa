package com.propertyManagement.propertyManagement.repository;

import com.propertyManagement.propertyManagement.entity.PropertyEntity;
import com.propertyManagement.propertyManagement.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Long> {
}
