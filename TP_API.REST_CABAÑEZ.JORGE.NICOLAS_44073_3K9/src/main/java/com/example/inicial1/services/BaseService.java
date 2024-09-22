package com.example.inicial1.services;

import java.util.List;

public interface BaseService <E> {

    public List <E> findAll() throws Exception; //Nos trae una lista de todas las entidades de la BD
    public E findById(Long id) throws Exception; //Nos trae un objeto de acuerdo a su id
    public E save(E entity) throws Exception; //Crea una nueva entidad (o genera una instancia?)
    public E update(Long id, E entity) throws Exception; //Actualiza un registro de la BD
    public boolean delete(Long id) throws Exception; //Deletea un objeto de la BD







}
