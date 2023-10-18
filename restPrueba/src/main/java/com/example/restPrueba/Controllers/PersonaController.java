package com.example.restPrueba.Controllers;

import com.example.restPrueba.Entities.Persona;
import com.example.restPrueba.Services.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
    @GetMapping("/search")
    public ResponseEntity<?> search (@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchPage")
    public ResponseEntity<?> search (@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @Override
    public ResponseEntity<?> getAll(java.awt.print.Pageable pageable) {
        return null;
    }
}
