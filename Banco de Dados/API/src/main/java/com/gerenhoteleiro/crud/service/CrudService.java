package com.gerenhoteleiro.crud.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Crud;
import com.gerenhoteleiro.crud.dto.Requisicao;
import com.gerenhoteleiro.crud.repository.CrudRepository;

@Service
public class CrudService {


	@Autowired
	private CrudRepository crudRepository;

	public Object save(@Valid Requisicao req) {
		Crud crud = new Crud();
		crudRepository.save(crud);
		return null;
	}
	

	
}
