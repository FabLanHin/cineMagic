package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Admin;

import java.util.List;

public interface IAdminService {

    List<Admin> getAdmin();
    Admin getAdminById(Long id);
    Admin addAdmin(Admin admin);
    void deleteAdmin(Admin admin);
    List<Admin> updateAdmin(int id, Admin admin);
}
