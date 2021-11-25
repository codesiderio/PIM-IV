package com.gerenhoteleiro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenhoteleiro.crud.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
