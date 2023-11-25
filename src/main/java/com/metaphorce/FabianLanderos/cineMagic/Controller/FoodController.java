package com.metaphorce.FabianLanderos.cineMagic.Controller;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Food;
import com.metaphorce.FabianLanderos.cineMagic.Exception.EmptyErrorException;
import com.metaphorce.FabianLanderos.cineMagic.Service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/foods/v0")
public class FoodController {

    @Autowired
    IFoodService iFoodService;

    @GetMapping("/food")
    public List<Food> getFood(){
        List<Food> food = new ArrayList<>();
        food = iFoodService.getFood();
        return food;
    }

    @GetMapping("/food/{id}")
    public Food getFoodById(@PathVariable Long id){
        return iFoodService.getFoodById(id);
    }

    @PostMapping("/food")
    public Food addFood(@Valid @RequestBody Food food, BindingResult result){

        if(result.hasErrors()){
            throw new EmptyErrorException("Empty Errors", "Error 408", HttpStatus.BAD_REQUEST, result);
        }

        return iFoodService.addFood(food);
    }

    @DeleteMapping("/food")
    public void deleteFood(Food food){
        iFoodService.deleteFood(food);
    }

    @PostMapping("/food/{id}")
    public List<Food> updateFood(@PathVariable int id, Food food){
        return iFoodService.updateFood(id, food);
    }
}
