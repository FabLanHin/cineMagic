package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Admin;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdminTest {
    public AdminTest(){

    }

    @Test
    public void testSubmitAdminName(){
        List<Admin> admins = new ArrayList<>();

        for (Admin admin : admins) {
            String name = admin.getAdminName();
            assertNotEquals("", name);
        }
    }

}
