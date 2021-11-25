package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "fatura")
@Data
public class Fatura {
	@Id
	@Column(name = "idfatura")
	private Integer idFatura;
	@Column(name = "empresa_idempresa")
	private Integer empresa_idEmpresa;
	@Column(name = "lancamentos_idlancamentos")
	private Integer lancamentos_idLancamentos;

}
