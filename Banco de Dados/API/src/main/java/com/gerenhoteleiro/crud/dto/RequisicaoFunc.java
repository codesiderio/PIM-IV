package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Funcionario")
public class RequisicaoFunc {

	
	private String nome;
	private Integer cpf;
	private Integer rg;
	private Date dataNascimento;
	private Date dataAdmissao;

}
