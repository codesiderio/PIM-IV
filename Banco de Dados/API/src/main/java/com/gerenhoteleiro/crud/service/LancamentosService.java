package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Lancamentos;
import com.gerenhoteleiro.crud.dto.RequisicaoLanc;
import com.gerenhoteleiro.crud.repository.LancamentosRepository;

@Service
public class LancamentosService {
    @Autowired
    private LancamentosRepository lancamentosRepository;
    
    public Lancamentos salvaLancamentos (RequisicaoLanc req) {
        Lancamentos f = new Lancamentos();
        f.setIdLancamentos(1);
        f.setFatura_idFatura(12);
        f.setConsumo_idConsumo(12);
        f.setHospedagem_idHospedagem(12);
        lancamentosRepository.save(f);
        return f;
    }
}