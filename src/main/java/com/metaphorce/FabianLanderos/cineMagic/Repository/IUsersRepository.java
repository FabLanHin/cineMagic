package com.metaphorce.FabianLanderos.cineMagic.Repository;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<Users, Long> {
}
