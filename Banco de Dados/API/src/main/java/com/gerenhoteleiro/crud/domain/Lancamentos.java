package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "lancamentos")
@Data
public class Lancamentos {
	@Id
	@Column(name = "idlancamentos")
	private Integer idLancamentos;
	@Column(name = "fatura_idfatura")
	private Integer fatura_idFatura;
	@Column(name = "consumo_idconsumo")
	private Integer consumo_idConsumo;
	@Column(name = "hospedagem_idhospedagem")
	private Integer hospedagem_idHospedagem;

}
