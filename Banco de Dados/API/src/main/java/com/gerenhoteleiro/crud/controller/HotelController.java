package com.gerenhoteleiro.crud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerenhoteleiro.crud.dto.Requisicao;
import com.gerenhoteleiro.crud.service.FuncionarioService;

@RestController
@RequestMapping (value = "/api/v1")
public class HotelController {
	@Autowired
	private FuncionarioService funcionarioService;
	
	
	@PostMapping (path = "/salvaFuncionario", consumes = "application/json")
	public @ResponseBody ResponseEntity<?> salvaFuncionario (@Valid @RequestBody Requisicao req) {
		try {
			return ResponseEntity.ok(funcionarioService.salvaFuncionario(req.getRequisicaoFunc()));
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("erro ao salvar funcionário; " + e.getMessage());
		}
	}

}
