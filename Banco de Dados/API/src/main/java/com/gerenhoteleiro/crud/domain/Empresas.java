package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "empresas")
@Data
public class Empresas {
	@Id
	@Column(name = "idempresa")
	private Integer idEmpresa;
	private String nome;
	private Integer cnpj;
	private String endereco;
	private Integer telefone;
	@Column(name = "fatura_idfatura")
	private Integer fatura_idFatura;

}
