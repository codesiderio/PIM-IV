package com.gerenhoteleiro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenhoteleiro.crud.domain.Apartamento;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer>{

}