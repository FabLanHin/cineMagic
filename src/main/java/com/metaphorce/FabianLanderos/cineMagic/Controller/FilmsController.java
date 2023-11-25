package com.metaphorce.FabianLanderos.cineMagic.Controller;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Films;
import com.metaphorce.FabianLanderos.cineMagic.Exception.EmptyErrorException;
import com.metaphorce.FabianLanderos.cineMagic.Exception.NumCharException;
import com.metaphorce.FabianLanderos.cineMagic.Service.IFilmsService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/films/v0")
public class FilmsController {

    @Autowired
    IFilmsService iFilmsService;

    @GetMapping("/film")
    public List<Films> getFilm(){
        List<Films> films = new ArrayList<>();
        films = iFilmsService.getFilm();
        return films;
    }

    @GetMapping("/film/{id}")
    public Films getFilmById(@PathVariable Long id){
        return iFilmsService.getFilmById(id);
    }

    @PostMapping("/film")
    public Films addFilm(@Valid @RequestBody Films films, BindingResult result){

        if(result.hasErrors()){
            throw new EmptyErrorException("Empty Errors", "Error 408", HttpStatus.BAD_REQUEST, result);
        } else if (films.getFilmName().length() > 2) {
            throw new NumCharException("Number of characters incorrect (Length)", "Error 411", HttpStatus.BAD_REQUEST, result);
        }

        return iFilmsService.addFilm(films);
    }

    @DeleteMapping("/film")
    public void deleteFilm(@RequestBody Films films){
        iFilmsService.deleteFilm(films);
    }

    @PutMapping("/film/{id}")
    public List<Films> updateFilms(@PathVariable int id, Films films){
        return iFilmsService.updateFilms(id, films);
    }
}
