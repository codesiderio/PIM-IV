package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Hospedagem")
public class RequisicaoHos {

    
    private Integer idHospedagem;
    private Integer hospede_idHospede;
    private Integer apartamento_idApartamento;
    private String nome;
    private Date entrada;
    private Date saida;
    private String descricao;
    private Integer lancamentos_idLancamentos;
    private Integer consumo_idConsumo;

}
