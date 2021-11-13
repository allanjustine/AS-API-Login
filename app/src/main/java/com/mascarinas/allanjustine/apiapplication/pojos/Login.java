package com.mascarinas.allanjustine.apiapplication.pojos;

public class Login {
    private String token, email, username, id, name, password;

    public Login() {}

    public Login(String token,String email, String username, String id, String name, String password) {
        this.token = token;
        this.email = email;
        this.username = username;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
