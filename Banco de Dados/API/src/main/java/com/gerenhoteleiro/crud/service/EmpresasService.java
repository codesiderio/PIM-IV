package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Empresas;
import com.gerenhoteleiro.crud.dto.RequisicaoEmp;
import com.gerenhoteleiro.crud.repository.EmpresasRepository;

@Service
public class EmpresasService {
    @Autowired
    private EmpresasRepository empresasRepository;
    
    public Empresas salvaEmpresas (RequisicaoEmp req) {
        Empresas f = new Empresas();
        f.setNome("Teste");
        f.setIdEmpresa(1);
        f.setCnpj(47406217);
        f.setFatura_idFatura(1);
        f.setTelefone(123456789);
        f.setEndereco("Rua do PIM");
        empresasRepository.save(f);
        return f;
    }

}
