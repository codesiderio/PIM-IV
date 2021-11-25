package com.gerenhoteleiro.crud.dto;

import java.io.Serializable;

import javax.validation.Valid;

import lombok.Data;

@Data
public class Requisicao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Valid
	private RequisicaoFunc requisicaoFunc;
	@Valid
	private RequisicaoApar requisicaoApar;
	@Valid
	private RequisicaoCat requisicaoCat;
	@Valid
	private RequisicaoCon requisicaoCon;
	@Valid
	private RequisicaoEmp requisicaoEmp;
	@Valid
	private RequisicaoFat requisicaoFat;
	@Valid
	private RequisicaoHos requisicaoHos;
	@Valid
	private RequisicaoHospe requisicaoHospe;
	@Valid
	private RequisicaoLanc requisicaoLanc;
	@Valid
	private RequisicaoProd requisicaoProd;
	
}
