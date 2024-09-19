package javaspring.javaspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javaspring.javaspringboot.entity.Users;
import javaspring.javaspringboot.service.HomeService;




@RestController
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping(value="/users")
    public ResponseEntity<?> getUsers() {
        List<Users> users = homeService.getListUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/users")
    public ResponseEntity<?> postUsers() {
        return null;
    }
    
    @PutMapping("/users/{id}")
    public ResponseEntity<?> putUsers() {
        return null;
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUsers() {
        return null;
    }

}
