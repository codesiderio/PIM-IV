package com.gerenhoteleiro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenhoteleiro.crud.domain.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer>{

}
