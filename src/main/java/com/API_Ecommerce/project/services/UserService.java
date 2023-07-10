package com.API_Ecommerce.project.services;

import com.API_Ecommerce.project.Model.user;


import java.util.List;
import java.util.Optional;


public interface UserService {
    List<user> findAllusers();
    Optional<user> findById(Long id);
    user AddUser(user U);
    user UpdateUser(user U);
    void  DeleteUser(Long id);

}
