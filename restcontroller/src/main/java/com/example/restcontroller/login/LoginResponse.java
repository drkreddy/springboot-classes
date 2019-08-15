package com.example.restcontroller.login;


public class LoginResponse {
    String name;
    public LoginResponse(){}
    public LoginResponse(String name){this.name = name;};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
