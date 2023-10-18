package com.example.restPrueba.Services;

import com.example.restPrueba.Entities.Autor;
import com.example.restPrueba.Repositories.AutorRepository;
import com.example.restPrueba.Repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
    }
}
