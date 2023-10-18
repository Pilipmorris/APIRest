package com.example.restPrueba.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base{
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;
    @Column(name = "titulo")
    private String titulo;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
