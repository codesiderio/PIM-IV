package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Lancamentos")
public class RequisicaoLanc {

    
     private Integer idLancamentos;
     private Integer fatura_idFatura;
     private Integer consumo_idConsumo;
     private Integer hospedagem_idHospedagem;

}
