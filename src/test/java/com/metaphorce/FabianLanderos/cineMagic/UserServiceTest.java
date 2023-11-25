package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Users;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IUsersRepository;
import com.metaphorce.FabianLanderos.cineMagic.Service.UsersService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @InjectMocks
    UsersService usersService;

    @Mock
    IUsersRepository iUsersRepository;

    Users users;

    @BeforeEach
    public void SetUp(){
        users = new Users(1L, "Maria", "maria@gmail.com", "2ish3r", 24, "I8", 2, true, 2, 1);
    }

    @Test
    public void testIUserRepositoryById(){
        when(iUsersRepository.findById(1L)).thenReturn(Optional.ofNullable(users));
        Users actualUser = usersService.getUsersById(1L);

        assertEquals(users, actualUser);
    }
}
