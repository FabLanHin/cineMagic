package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Admin;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IAdminRepository;
import com.metaphorce.FabianLanderos.cineMagic.Service.AdminService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AdminServiceTest {

    @InjectMocks
    AdminService adminService;

    @Mock
    IAdminRepository iAdminRepository;

    Admin admin;

    @BeforeEach
    public void SetUp(){
        admin = new Admin(1L, "Carmina", "carmina@cine.com", "cine92hjksd", 72345);
    }

    @Test
    public void testIAdminRepositoryById(){
        when(iAdminRepository.findById(1L)).thenReturn(Optional.ofNullable(admin));
        Admin actualAdmin = adminService.getAdminById(1L);

        assertEquals(admin, actualAdmin);
    }
}
