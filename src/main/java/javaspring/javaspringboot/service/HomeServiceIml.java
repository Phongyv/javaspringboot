package javaspring.javaspringboot.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import javaspring.javaspringboot.entity.Users;

@Component
public class HomeServiceIml implements HomeService {
    private static ArrayList<Users> users = new ArrayList<Users>();
    static {
        users.add(new Users( "Phong", "321phong@gmail.com", "kgfhfgsdhfgds"));
        users.add(new Users( "Khanh", "khanh4747@gmail.com", "okvmco bcmb "));
        users.add(new Users( "Long", "lon43434g@gmail.com", "rururthgh"));
        users.add(new Users( "Ut", "ut0752@gmail.com", "zvzvzxcxc"));
    }

    @Override
    public ArrayList<Users> getListUsers() {
        return users;
    }

}
