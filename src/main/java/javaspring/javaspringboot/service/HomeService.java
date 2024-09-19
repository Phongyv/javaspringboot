package javaspring.javaspringboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import javaspring.javaspringboot.entity.Users;

@Service
public interface  HomeService {
    public List<Users> getListUsers();
}

