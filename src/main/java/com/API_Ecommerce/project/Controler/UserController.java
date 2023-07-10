package com.API_Ecommerce.project.Controler;

import com.API_Ecommerce.project.Model.user;
import com.API_Ecommerce.project.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<user> findAllUser(){
        return userService.findAllusers();
    }
    @GetMapping("/{id}")
    public Optional<user> findUserById(@PathVariable("id") Long id){
        return userService.findById(id);
    }
    @PostMapping
    public  user AddUser(@RequestBody user u){
        return userService.AddUser(u);
    }
    @PutMapping
    public user updateProduit(@RequestBody user u){
        return  userService.UpdateUser(u);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.DeleteUser(id);
    }
}
