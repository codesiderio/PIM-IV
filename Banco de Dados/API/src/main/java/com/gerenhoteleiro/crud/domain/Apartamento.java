package com.gerenhoteleiro.crud.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "apartamento")
@Data

public class Apartamento {
	@Id
	@Column(name = "idapartamento")
	private Integer idApartamento;
	private String nome;
	@Column(name = "duracaoestadia")
	private Date duracaoEstadia;
	@Column(name = "duracaoreserva")
	private Date duracaoReserva;
	private Integer telefone;

}
