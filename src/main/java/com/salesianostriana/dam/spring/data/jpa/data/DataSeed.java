package com.salesianostriana.dam.spring.data.jpa.data;

import com.salesianostriana.dam.spring.data.jpa.models.Pelicula;
import com.salesianostriana.dam.spring.data.jpa.repository.CriticaRepository;
import com.salesianostriana.dam.spring.data.jpa.repository.GeneroRepository;
import com.salesianostriana.dam.spring.data.jpa.repository.PeliculaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@DependsOn
public class DataSeed {

    private final PeliculaRepository peliculaRepository;
    private final CriticaRepository criticaRepository;
    private final GeneroRepository generoRepository;

    public DataSeed(PeliculaRepository peliculaRepository, CriticaRepository criticaRepository, GeneroRepository generoRepository) {
        this.peliculaRepository = peliculaRepository;
        this.criticaRepository = criticaRepository;
        this.generoRepository = generoRepository;
    }

    @PostConstruct
    public void cargarDatos() {
    }
    }

