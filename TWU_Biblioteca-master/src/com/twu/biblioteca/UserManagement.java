package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
    private ArrayList<User> userList = new ArrayList<>();
    private User curUser;

    public UserManagement(){
        boolean add = userList.add(new User("User A", "AAA@google.com", "111","aaa"));
        userList.add(new User("User B", "BBB@google.com", "222","bbb"));
        userList.add(new User("User C", "CCC@google.com", "333","ccc"));
    }

    public boolean isLoggedIn(){
        return curUser != null;
    }

    public void logIn(){
        if(isLoggedIn()){
            System.out.println("Already logged in.");
            return;
        }

        System.out.println("Type you username");
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        boolean userExist = false;

        System.out.println("Type you password");
        Scanner s2 = new Scanner(System.in);
        String password = s2.nextLine();

        for(User u:userList){
            if(u.getName().equals(name) && u.getPassword().equals(password)){
                userExist = true;
                curUser = u;
            }
        }
        if(!userExist){
            System.out.println("Wrong username or password.");
        }
        else{
            System.out.println("Log in successfully.");
        }

    }

    public void logOut(){
        if(!isLoggedIn()){
            System.out.println("Not logged in.");
            return;
        }
        curUser=null;
        System.out.println("Log out successfully");
    }

    public void showUserInfo(){
        if(!isLoggedIn()){
            System.out.println("Not logged in");
            return;
        }
        curUser.printUserInfo();
    }

}
