package com.metaphorce.FabianLanderos.cineMagic.Controller;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Users;
import com.metaphorce.FabianLanderos.cineMagic.Exception.EmptyErrorException;
import com.metaphorce.FabianLanderos.cineMagic.Exception.NumCharException;
import com.metaphorce.FabianLanderos.cineMagic.Service.IUsersService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users/v0")
public class UsersController {

    @Autowired
    IUsersService iUsersService;

    @GetMapping("/user")
    public List<Users> getUsers(){
        List<Users> user = new ArrayList<>();
        user = iUsersService.getUsers();
        return user;
    }

    @GetMapping("/user/{id}")
    public Users getUsersById(@PathVariable Long id){
        return iUsersService.getUsersById(id);
    }

    @PostMapping("/user")
    public Users addUsers(@Valid @RequestBody Users user, BindingResult result){

        if(result.hasErrors()){
            throw new EmptyErrorException("Empty Errors", "Error 408", HttpStatus.BAD_REQUEST, result);
        }else if (user.getName().length() > 2) {
            throw new NumCharException("Number of characters incorrect (Length)", "Error 411", HttpStatus.BAD_REQUEST, result);
        }

        return iUsersService.addUsers(user);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestBody Users user){
        iUsersService.deleteUsers(user);
    }

    @PutMapping("/user/{id}")
    public List<Users> updateUsers(@PathVariable int id, Users user){
        return iUsersService.updateUsers(id, user);
    }
}
