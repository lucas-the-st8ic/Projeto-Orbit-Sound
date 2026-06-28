package com.orbitsound.model;

import jakarta.persistence.*;

@Entity
@Table(name="Artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista
}
