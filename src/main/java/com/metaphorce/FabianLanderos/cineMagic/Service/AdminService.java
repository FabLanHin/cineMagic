package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Admin;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService implements IAdminService{

    @Autowired
    IAdminRepository iAdminRepository;

    @Override
    public List<Admin> getAdmin() {
        List<Admin> admins = new ArrayList<>();
        admins = iAdminRepository.findAll();
        return admins;
    }

    @Override
    public Admin getAdminById(Long id) {
        Admin admin = new Admin();
        admin = iAdminRepository.findById(id).orElse(null);
        return admin;
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return iAdminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Admin admin) {
        iAdminRepository.delete(admin);
    }

    @Override
    public List<Admin> updateAdmin(int id, Admin admin) {
        List<Admin> admins = new ArrayList<>();
        admins.set(id, admin);
        return admins;
    }
}
