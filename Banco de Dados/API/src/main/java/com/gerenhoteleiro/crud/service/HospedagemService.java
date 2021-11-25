package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Hospedagem;
import com.gerenhoteleiro.crud.dto.RequisicaoHos;
import com.gerenhoteleiro.crud.repository.HospedagemRepository;

@Service
public class HospedagemService {
    @Autowired
    private HospedagemRepository hospedagemRepository;
    
    public Hospedagem salvaHospedagem (RequisicaoHos req) {
        Hospedagem f = new Hospedagem();
        f.setNome("Teste");
        f.setHospede_idHospede(1);
        f.setApartamento_idApartamento(12);
        f.setLancamentos_idLancamentos(12);
        f.setConsumo_idConsumo(12);
        f.setIdHospedagem(1);
        f.setDescricao("Testeeeee");
        f.setEntrada(new Date());
        f.setSaida(new Date());
        hospedagemRepository.save(f);
        return f;
    }

}
