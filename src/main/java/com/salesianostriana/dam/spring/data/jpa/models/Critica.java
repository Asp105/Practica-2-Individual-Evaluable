package com.salesianostriana.dam.spring.data.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class Critica {

    @Id @GeneratedValue
    private Long id;

    private String autor;

    private String texto;

    private Double puntuacion;

    @OneToOne
    private Pelicula pelicula;
}
