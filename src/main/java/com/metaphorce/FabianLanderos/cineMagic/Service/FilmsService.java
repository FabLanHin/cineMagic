package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Films;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IFilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmsService implements IFilmsService{

    @Autowired
    IFilmsRepository iFilmsRepository;

    @Override
    public List<Films> getFilm() {
        List<Films> films = new ArrayList<>();
        films = iFilmsRepository.findAll();
        return films;
    }

    @Override
    public Films getFilmById(Long id) {
        Films films = new Films();
        films = iFilmsRepository.findById(id).orElse(null);
        return films;
    }

    @Override
    public Films addFilm(Films films) {
        return iFilmsRepository.save(films);
    }

    @Override
    public void deleteFilm(Films films) {
        iFilmsRepository.delete(films);
    }

    @Override
    public List<Films> updateFilms(int id, Films films) {
        List<Films> film = new ArrayList<>();
        film.set(id, films);
        return film;
    }
}
