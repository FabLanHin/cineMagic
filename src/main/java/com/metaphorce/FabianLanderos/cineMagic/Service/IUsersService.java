package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Users;

import java.util.List;

public interface IUsersService {

    List<Users> getUsers();
    Users getUsersById(Long id);
    Users addUsers(Users users);
    void deleteUsers(Users users);
    List<Users> updateUsers(int id, Users users);

}
