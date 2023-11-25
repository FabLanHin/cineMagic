package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Food;

import java.util.List;

public interface IFoodService {

    List<Food> getFood();
    Food getFoodById(Long id);
    Food addFood(Food food);
    void deleteFood(Food food);
    List<Food> updateFood(int id, Food food);
}
