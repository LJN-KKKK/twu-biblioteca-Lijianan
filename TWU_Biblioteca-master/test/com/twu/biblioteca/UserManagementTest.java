package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
public class UserManagementTest {

    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
    ByteArrayOutputStream output;

    @Before
    public void setUp(){
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test //log in
    public void testLogIn(){
        UserManagement userManagement = new UserManagement();
        userManagement.logIn("User A","aaa");
        assertEquals(userManagement.getCurUser().getName(),"User A");
        assertEquals(userManagement.getCurUser().getPassword(),"aaa");
        assertTrue(userManagement.isLoggedIn());
    }

    @Test //log in with wrong name or password
    public void testInvalidLogIn(){
        UserManagement userManagement = new UserManagement();
        userManagement.logIn("User A","bbb");
        assertEquals("Wrong username or password.\r\n", output.toString());
        assertFalse(userManagement.isLoggedIn());
    }

    @Test //re log in
    public void testReLogIn(){
        UserManagement userManagement = new UserManagement();
        userManagement.logIn("User A","aaa");
        userManagement.logIn("User A","aaa");
        assertEquals("Logged in successfully.\r\n"
                +"Already logged in.\r\n", output.toString());
        assertTrue(userManagement.isLoggedIn());
    }

    @Test //log out
    public void testLogOut(){
        UserManagement userManagement = new UserManagement();
        userManagement.logIn("User A","aaa");
        userManagement.logOut();
        assertEquals("Logged in successfully.\r\n"
                +"Logged out successfully.\r\n", output.toString());
        assertFalse(userManagement.isLoggedIn());
    }

    @Test //invalid log out
    public void testInvalidLogOut(){
        UserManagement userManagement = new UserManagement();
        userManagement.logOut();
        assertEquals("Not logged in.\r\n", output.toString());
        assertFalse(userManagement.isLoggedIn());
    }
}
