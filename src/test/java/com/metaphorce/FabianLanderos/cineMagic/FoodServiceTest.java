package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Food;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IFoodRepository;
import com.metaphorce.FabianLanderos.cineMagic.Service.FoodService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FoodServiceTest {
    @InjectMocks
    FoodService foodService;

    @Mock
    IFoodRepository iFoodRepository;

    Food food;

    @BeforeEach
    public void SetUp(){
        food = new Food(1L, "M", "G", "M&M", 1);
    }

    @Test
    public void testIAdminRepositoryById(){
        when(iFoodRepository.findById(1L)).thenReturn(Optional.ofNullable(food));
        Food actualFood = foodService.getFoodById(1L);

        assertEquals(food, actualFood);
    }
}
