package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Films;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IFilmsRepository;
import com.metaphorce.FabianLanderos.cineMagic.Service.FilmsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FilmsServiceTest {
    @InjectMocks
    FilmsService filmsService;

    @Mock
    IFilmsRepository iFilmsRepository;

    Films films;

    @BeforeEach
    public void SetUp(){
        films = new Films(1L, "Alien", "In the space, no one can hear you scream", "R", 8.99, false, 2);
    }

    @Test
    public void testIAdminRepositoryById(){
        when(iFilmsRepository.findById(1L)).thenReturn(Optional.ofNullable(films));
        Films actualFilm = filmsService.getFilmById(1L);

        assertEquals(films, actualFilm);
    }
}
