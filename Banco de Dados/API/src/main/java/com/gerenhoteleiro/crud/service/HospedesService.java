package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Hospedes;
import com.gerenhoteleiro.crud.dto.RequisicaoHospe;
import com.gerenhoteleiro.crud.repository.HospedesRepository;

@Service
public class HospedesService {
    @Autowired
    private HospedesRepository hospedesRepository;
    
    public Hospedes salvaHospedes (RequisicaoHospe req) {
        Hospedes f = new Hospedes();
        f.setNome("Teste");
        f.setIdHospede(1);
        f.setEmpresa_idEmpresa(1);
        f.setCpf(321456987);
        f.setRg(1323546);
        f.setEndereco("TESTE");
        f.setNumero(769);
        f.setTelefone(169777822);
        f.setDataNascimento(new Date());
        f.setNacionalidade("");
        f.setEmail("");
        f.setNumquarto(123);
        f.setHospedagem_idHospedagem(1);
        hospedesRepository.save(f);
        return f;
    }

}
