package com.example.restPrueba.Services;

import com.example.restPrueba.Entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable>{
    //Creamos todos los metodos Abstractos

    // Obtener todos los registros
    public List<E> findAll() throws Exception;

    public Page<E> findAll (Pageable pageable) throws Exception;

    // Buscamos un registro en la Base de Datos, pasando un id como parámetro
    public E findById(ID id) throws Exception;

    // Guardo la entidad genérica
    public E save(E entity) throws Exception;

    // Actualizo una entidad, pero previo la debo buscar en la Base de Datos
    public E update(ID id, E entity) throws Exception;

    // Elimino un entidad y le paso un id como parámetro
    public boolean delete(ID id) throws Exception;


}

    

