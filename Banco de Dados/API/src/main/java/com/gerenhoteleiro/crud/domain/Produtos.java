package com.gerenhoteleiro.crud.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "produtos")
@Data
public class Produtos {
	@Id
	@Column(name = "idprodutos")
	private Integer idProdutos;
	@Column(name = "categoria_idcategoria")
	private Integer categoria_idCategoria;
	@Column(name = "idconsumo")
	private Integer idConsumo;
	private String nome;
	private Integer valor;
	private String tipo;

}
