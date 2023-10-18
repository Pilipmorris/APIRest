package com.example.restPrueba.Repositories;

import com.example.restPrueba.Entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
