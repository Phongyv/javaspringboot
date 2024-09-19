package javaspring.javaspringboot.entity;

import org.springframework.stereotype.Component;

@Component
public class Users {
    private String name;
    private String email;
    private String password;

    public Users() {
    }

    public Users(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users name(String name) {
        setName(name);
        return this;
    }

    public Users email(String email) {
        setEmail(email);
        return this;
    }

    public Users password(String password) {
        setPassword(password);
        return this;
    }
    
    
}
