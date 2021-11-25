package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Apartamento")
public class RequisicaoApar {

    
    private String nome;
    private Date duracaoEstadia;
    private Date duracaoReserva;
    private Integer telefone;

}
