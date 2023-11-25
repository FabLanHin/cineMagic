package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Films;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FilmTest {

    public FilmTest(){

    }

    @Test
    public void testSubmitFilmName(){
        List<Films> films = new ArrayList<>();

        for (Films film : films) {
            String name = film.getFilmName();
            assertNotEquals("", name);
        }
    }
}
