package com.metaphorce.FabianLanderos.cineMagic.Repository;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepository extends JpaRepository<Food, Long> {
}
