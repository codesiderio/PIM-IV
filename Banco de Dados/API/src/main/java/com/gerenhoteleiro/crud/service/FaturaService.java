package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Fatura;
import com.gerenhoteleiro.crud.dto.RequisicaoFat;
import com.gerenhoteleiro.crud.repository.FaturaRepository;

@Service
public class FaturaService {
    @Autowired
    private FaturaRepository faturaRepository;
    
    public Fatura salvaFatura (RequisicaoFat req) {
        Fatura f = new Fatura();
         f.setEmpresa_idEmpresa(1);
         f.setLancamentos_idLancamentos(1);
         f.setIdFatura(1);
     faturaRepository.save(f);
        return f;
    }

}
