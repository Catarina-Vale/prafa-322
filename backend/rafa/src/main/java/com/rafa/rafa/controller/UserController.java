package com.rafa.rafa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafa.rafa.Service.Interfaces.IUserService;
import com.rafa.rafa.models.Materia;
import com.rafa.rafa.models.User;

@RestController
public class UserController {

    @Autowired
    private IUserService userService; // Inject UserService

    @PostMapping("/user/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user/materia/{id}")
    public ResponseEntity<List<Materia>> getEnrolledMateriasByUserId(@PathVariable int id) {
        List<Materia> materias = userService.getEnrolledMateriasByUserId(id);
        if (materias != null) {
            return new ResponseEntity<>(materias, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/user/login")
    public ResponseEntity<User> makeLogin(@RequestParam int id, @RequestParam String password) {
        User loginStatus = userService.makeLogin(id, password);
        return new ResponseEntity<>(loginStatus, HttpStatus.OK);
    }
}