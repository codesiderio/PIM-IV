package com.gerenhoteleiro.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenhoteleiro.crud.domain.Crud;

@Repository
public interface CrudRepository extends JpaRepository<Crud, Integer> {
	
}
