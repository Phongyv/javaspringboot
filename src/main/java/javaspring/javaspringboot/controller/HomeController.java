package javaspring.javaspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaspring.javaspringboot.entity.Users;
import javaspring.javaspringboot.service.HomeService;






@RestController
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/users/search")
    public ResponseEntity<?> getMethodName(@RequestParam(name="keyword",required=false,defaultValue="") String name) {
        Users users = homeService.searchUsers(name);
        return ResponseEntity.ok(users);
    }
    

    @GetMapping(value="/users")
    public ResponseEntity<?> getUsers() {
        List<Users> users = homeService.getListUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{name}")
    public ResponseEntity<?> getUserById(@PathVariable String name) {
        Users user = homeService.getUsersById(name);
        return ResponseEntity.ok(user);
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
