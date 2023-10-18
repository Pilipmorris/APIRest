package com.example.restPrueba.Controllers;
import com.example.restPrueba.Entities.Localidad;
import com.example.restPrueba.Services.LocalidadServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}
