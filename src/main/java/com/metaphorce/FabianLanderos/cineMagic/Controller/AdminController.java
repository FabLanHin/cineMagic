package com.metaphorce.FabianLanderos.cineMagic.Controller;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Admin;
import com.metaphorce.FabianLanderos.cineMagic.Exception.EmptyErrorException;
import com.metaphorce.FabianLanderos.cineMagic.Exception.NumCharException;
import com.metaphorce.FabianLanderos.cineMagic.Service.IAdminService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admins/v0")
public class AdminController {

    @Autowired
    IAdminService iAdminService;

    @GetMapping("/admin")
    public List<Admin> getAdmin(){
        List<Admin> admin = new ArrayList<>();
        admin = iAdminService.getAdmin();
        return admin;
    }

    @GetMapping("admin/{id}")
    public Admin getAdminById(@PathVariable Long id){
        return iAdminService.getAdminById(id);
    }

    @PostMapping("/admin")
    public Admin addAdmin(@Valid @RequestBody Admin admin, BindingResult result){

        if(result.hasErrors()){
            throw new EmptyErrorException("Empty Errors", "Error 408", HttpStatus.BAD_REQUEST, result);
        } else if (admin.getAdminName().length() > 2) {
            throw new NumCharException("Number of characters incorrect (Length)", "Error 411", HttpStatus.BAD_REQUEST, result);
        }

        return iAdminService.addAdmin(admin);
    }

    @DeleteMapping("/admin")
    public void deleteAdmin(@RequestBody Admin admin){
        iAdminService.deleteAdmin(admin);
    }

    @PutMapping("/admin/{id}")
    public List<Admin> updateAdmin(@PathVariable int id, Admin admin){
        return iAdminService.updateAdmin(id, admin);
    }
}
