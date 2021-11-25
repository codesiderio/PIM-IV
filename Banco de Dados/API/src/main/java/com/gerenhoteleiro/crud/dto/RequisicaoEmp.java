package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Empresa")
public class RequisicaoEmp {

    
    private Integer idEmpresa;
    private String nome;
    private Integer cnpj;
    private String endereco;
    private Integer telefone;
    private Integer fatura_idFatura;

}
