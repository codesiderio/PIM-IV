package com.gerenhoteleiro.crud.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "CRUD")
public class CrudDTO implements Serializable {

	private static final long serialVersionUID = -5730788141183356868L;

	@NotNull(message = "Id referencia é obrigatória")
	private Integer id;
	
}
