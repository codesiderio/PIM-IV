package com.gerenhoteleiro.crud.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "crud")
public class Crud implements Serializable {

	private static final long serialVersionUID = -5730788141183356868L;

	@Id
	@Column(name = "id")
	private Integer id;
		
}
