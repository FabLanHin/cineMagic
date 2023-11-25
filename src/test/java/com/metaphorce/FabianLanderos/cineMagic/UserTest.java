package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Users;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    public UserTest(){

    }

    @Test
    public void testSubmitUserName(){
        List<Users> users = new ArrayList<>();

        for (Users user : users) {
            String name = user.getName();
            assertNotEquals("", name);
        }
    }

    @Test
    public void isAgeNotZero(){
        List<Users> users = new ArrayList<>();

        for (Users user : users) {
            int age = user.getAge();
            assertNotEquals(0, age);
        }
    }
}
