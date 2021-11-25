package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Apartamento;
import com.gerenhoteleiro.crud.dto.RequisicaoApar;
import com.gerenhoteleiro.crud.repository.ApartamentoRepository;

@Service
public class ApartamentoService {
    @Autowired
    private ApartamentoRepository apartamentoRepository;
    
    public Apartamento salvaApartamento (RequisicaoApar req) {
        Apartamento f = new Apartamento();
        f.setNome("Teste");
        f.setIdApartamento(1);
        f.setDuracaoEstadia(new Date());
        f.setDuracaoReserva(new Date());
        f.setTelefone(123456789);
        apartamentoRepository.save(f);
        return f;
    }

}
