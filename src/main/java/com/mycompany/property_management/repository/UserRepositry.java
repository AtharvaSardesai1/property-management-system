package com.mycompany.property_management.repository;

import com.mycompany.property_management.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositry extends CrudRepository<UserEntity, Long> {
}
