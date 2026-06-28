package com.orbitsound.model;

import jakarta.persistence.*;

@Entity
@Table(name= "Musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMusica;
}
