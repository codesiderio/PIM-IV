package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "categoria")
@Data
public class Categoria {
	@Id
	@Column(name = "idcategoria")
	private Integer idCategoria;
	private String descricao;
	private String setor;
}
