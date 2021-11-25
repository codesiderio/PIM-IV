package com.gerenhoteleiro.crud.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
@Data
//@ApiModel(value = "Fatura")
public class RequisicaoFat {

    
    private Integer idFatura;
    private Integer empresa_idEmpresa;
    private Integer lancamentos_idLancamentos;

}
