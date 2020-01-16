package com.example.converter.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.converter.entity.Pais;

@Repository
public interface PaisDAO extends CrudRepository<Pais, Long> {

}
