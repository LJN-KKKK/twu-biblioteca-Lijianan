package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String phone;
    private String password;

    public User(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void printUserInfo(){
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Phone:"+phone);
    }
}
