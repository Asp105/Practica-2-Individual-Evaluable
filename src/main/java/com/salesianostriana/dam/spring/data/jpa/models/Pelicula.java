package com.salesianostriana.dam.spring.data.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Pelicula {

    @Id @GeneratedValue
    private Long id;

    private String titulo;

    private int anioEstreno;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "critica_id")
    private List<Critica> criticas = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "genero_id")
    private Genero genero;

    public void addCritica(Critica critica) {
        criticas.add(critica);
        critica.setPelicula(this);
    }

    public void removeCritica (Critica critica) {
        criticas.remove(critica);
        critica.setPelicula(null);
    }

}
