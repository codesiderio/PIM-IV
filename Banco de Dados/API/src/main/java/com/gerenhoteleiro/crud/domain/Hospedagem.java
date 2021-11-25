package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "hospedagem")
@Data
public class Hospedagem {
	@Id
	@Column(name = "idhospedagem")
	private Integer idHospedagem;
	@Column(name = "hospede_idhospede")
	private Integer hospede_idHospede;
	@Column(name = "apartamento_idapartamento")
	private Integer apartamento_idApartamento;
	private String nome;
	private Date entrada;
	private Date saida;
	private String descricao;
	@Column(name = "lancamentos_idlancamentos")
	private Integer lancamentos_idLancamentos;
	@Column(name = "consumo_idconsumo")
	private Integer consumo_idConsumo;

}
