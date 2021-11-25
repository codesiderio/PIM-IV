package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Hospede")
public class RequisicaoHospe {

    
    private Integer idHospede;
    private Integer empresa_idEmpresa;
    private String nome;
    private Integer cpf;
    private Integer rg;
    private String endereco;
    private Integer numero;
    private Integer telefone;
    private Date dataNascimento;
    private String nacionalidade;
    private String email;
    private Integer numquarto;
    private Integer hospedagem_idHospedagem;

}
