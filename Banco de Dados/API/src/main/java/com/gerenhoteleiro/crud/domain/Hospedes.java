package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "hospedes")
@Data
public class Hospedes {
	@Id
	@Column(name = "idhospede")
	private Integer idHospede;
	@Column(name = "empresa_idempresa")
	private Integer empresa_idEmpresa;
	private String nome;
	private Integer cpf;
	private Integer rg;
	private String endereco;
	private Integer numero;
	private Integer telefone;
	@Column(name = "datanascimento")
	private Date dataNascimento;
	private String nacionalidade;
	private String email;
	private Integer numquarto;
	@Column(name = "hospedagem_idhospedagem")
	private Integer hospedagem_idHospedagem;

}
