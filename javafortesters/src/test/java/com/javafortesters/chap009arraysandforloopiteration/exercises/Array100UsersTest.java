package com.javafortesters.chap009arraysandforloopiteration.exercises;

import domainentities.User;
import static domainentities.UsersArray.createUsersArray;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Array100UsersTest {
   @Test
   public void returnsArray(){
       User[] arrayOfUsers = createUsersArray();
       boolean result = arrayOfUsers instanceof User[];
       assertTrue("returns an User[]",result);
   }
   @Test
   public void defaultLength100(){
       User[] arrayOfUsers = createUsersArray();
       int result = arrayOfUsers.length;
       assertEquals("default length 100", 100, result);
   }

    @Test
    public void specifiedLength100(){
        User[] arrayOfUsers = createUsersArray(100);
        int result = arrayOfUsers.length;
        assertEquals("specified length 100", 100, result);
    }

    @Test
    public void specifiedLength45(){
        User[] arrayOfUsers = createUsersArray(45);
        int result = arrayOfUsers.length;
        assertEquals("specified length 45", 45, result);
    }

    @Test
    public void arrayFirstElementIsUser(){
        User[] arrayOfUsers = createUsersArray();
        User firstElement = arrayOfUsers[0];
        boolean result = firstElement instanceof User;
        assertTrue("First element is User", result);
    }

    @Test
    public void arrayEntirelyUser(){
        User[] arrayOfUsers = createUsersArray();
        for(int i = 0; i < arrayOfUsers.length; i++) {
            User element = arrayOfUsers[i];
            boolean result = element instanceof User;
            assertTrue("element "+ i +" is User", result);
        }
    }

    @Test
    public void firstUserName(){
        User[] arrayOfUsers = createUsersArray();
        User firstElement = arrayOfUsers[0];
        String result = firstElement.getUsername();
        assertEquals("First User name", "user1", result);
    }

    @Test
    public void firstUserPassword(){
        User[] arrayOfUsers = createUsersArray();
        User firstElement = arrayOfUsers[0];
        String result = firstElement.getPassword();
        assertEquals("First User password", "password1", result);
    }

    @Test
    public void allUserNames(){
        User[] arrayOfUsers = createUsersArray();
        for(int i = 0; i < arrayOfUsers.length; i++) {
            User element = arrayOfUsers[i];
            String result = element.getUsername();
            int j = i+1;
            assertEquals("User "+ j , "user"+j, result);
        }
    }

    @Test
    public void allUserPasswords(){
        User[] arrayOfUsers = createUsersArray();
        for(int i = 0; i < arrayOfUsers.length; i++) {
            User element = arrayOfUsers[i];
            String result = element.getPassword();
            int j = i+1;
            assertEquals("User "+ j , "password"+j, result);
        }
    }
}
