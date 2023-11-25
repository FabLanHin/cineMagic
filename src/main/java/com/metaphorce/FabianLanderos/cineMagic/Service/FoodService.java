package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Food;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService implements IFoodService{

    @Autowired
    IFoodRepository iFoodRepository;

    @Override
    public List<Food> getFood() {
        List<Food> food = new ArrayList<>();
        food = iFoodRepository.findAll();
        return food;
    }

    @Override
    public Food getFoodById(Long id) {
        Food food = new Food();
        food = iFoodRepository.findById(id).orElse(null);
        return food;
    }

    @Override
    public Food addFood(Food food) {
        return iFoodRepository.save(food);
    }

    @Override
    public void deleteFood(Food food) {
        iFoodRepository.delete(food);
    }

    @Override
    public List<Food> updateFood(int id, Food food) {
        List<Food> foods = new ArrayList<>();
        foods.set(id, food);
        return foods;
    }
}
