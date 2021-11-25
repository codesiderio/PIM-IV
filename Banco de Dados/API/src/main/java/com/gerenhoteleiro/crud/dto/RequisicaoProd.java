package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Produtos")
public class RequisicaoProd {

    
    private Integer idProdutos;
    private Integer categoria_idCategoria;
    private Integer idConsumo;
    private String nome;
    private Integer valor;
    private String tipo;

}
