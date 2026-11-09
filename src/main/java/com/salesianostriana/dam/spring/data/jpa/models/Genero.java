package com.salesianostriana.dam.spring.data.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Genero {

    @Id @GeneratedValue
    private Long id;

    private String nombre;
}
