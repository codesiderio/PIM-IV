package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "funcionario")
@Data
public class Funcionario { 
	@Id
	@Column(name = "idfuncionario")
	//@GeneratedValue
	private Integer idFuncionario;
	private String nome;
	private Integer cpf;
	private Integer rg;
	@Column(name = "datanascimento")
	private Date dataNascimento;
	@Column(name = "dataadmissao")
	private Date dataAdmissao;

}
