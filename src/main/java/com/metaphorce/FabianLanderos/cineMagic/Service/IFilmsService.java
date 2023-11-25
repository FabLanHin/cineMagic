package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Films;

import java.util.List;

public interface IFilmsService {

    List<Films> getFilm();
    Films getFilmById(Long id);
    Films addFilm(Films films);
    void deleteFilm(Films films);
    List<Films> updateFilms(int id, Films films);
}
