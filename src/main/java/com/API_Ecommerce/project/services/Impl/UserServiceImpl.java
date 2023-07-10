package com.API_Ecommerce.project.services.Impl;

import com.API_Ecommerce.project.Model.Produit;
import com.API_Ecommerce.project.Model.user;
import com.API_Ecommerce.project.Repository.UserReporsetory;
import com.API_Ecommerce.project.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class UserServiceImpl implements UserService {
    private final UserReporsetory userReporsetory;

    public UserServiceImpl(UserReporsetory userReporsetory) {
        this.userReporsetory = userReporsetory;
    }


    @Override
    public List<user> findAllusers() {
        return userReporsetory.findAll();
    }

    @Override
    public Optional<user> findById(Long id) {
        return userReporsetory.findById(id);
    }

    @Override
    public user AddUser(user user) {
        return userReporsetory.save(user);
    }
    @Override
    public user UpdateUser(user user) {

        Optional<user> existingUser = userReporsetory.findById(user.getIduser());
        if (existingUser.isPresent()) {

            user updatedUser = existingUser.get();
            updatedUser.setNom(user.getNom());
            updatedUser.setPrenom(user.getPrenom());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setAdmin(user.getAdmin());




            return userReporsetory.save(updatedUser);
        } else {

            return null;
        }
    }

    @Override
    public void DeleteUser(Long id) {
        userReporsetory.deleteById(id);

    }
}

