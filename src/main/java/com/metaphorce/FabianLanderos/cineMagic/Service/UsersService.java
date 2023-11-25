package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Users;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService implements IUsersService{

    @Autowired
    IUsersRepository iUsersRepository;

    @Override
    public List<Users> getUsers() {
        List<Users> users = new ArrayList<>();
        users = iUsersRepository.findAll();
        return users;
    }

    @Override
    public Users getUsersById(Long id) {
        Users users = new Users();
        users = iUsersRepository.findById(id).orElse(null);
        return users;
    }

    @Override
    public Users addUsers(Users users) {
        return iUsersRepository.save(users);
    }

    @Override
    public void deleteUsers(Users users) {
        iUsersRepository.delete(users);
    }

    @Override
    public List<Users> updateUsers(int id, Users users) {
        List<Users> users1 = new ArrayList<>();
        users1.set(id, users);
        return users1;
    }
}
