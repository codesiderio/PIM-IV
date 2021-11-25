package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "consumo")
@Data
public class Consumo {
	@Id
	@Column(name = "idconsumo")
	private Integer idConsumo;
	@Column(name = "hospedagem_idhospedagem")
	private Integer hospedagem_idHospedagem;
	@Column(name = "produtos_idprodutos")
	private Integer produtos_idProdutos;
	private Integer quantidade;
	private Integer valor;
	
}
