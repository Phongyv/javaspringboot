package javaspring.javaspringboot.model.dto;

public class UserDto {
    private String name;
    private String email;


    public UserDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserDto name(String name) {
        setName(name);
        return this;
    }

    public UserDto email(String email) {
        setEmail(email);
        return this;
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
