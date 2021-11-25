package com.gerenhoteleiro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenhoteleiro.crud.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

}
