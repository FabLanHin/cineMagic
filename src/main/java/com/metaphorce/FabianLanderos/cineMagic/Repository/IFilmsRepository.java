package com.metaphorce.FabianLanderos.cineMagic.Repository;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFilmsRepository extends JpaRepository<Films, Long> {
}
