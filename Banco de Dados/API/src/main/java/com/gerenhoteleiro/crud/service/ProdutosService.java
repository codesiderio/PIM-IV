package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Produtos;
import com.gerenhoteleiro.crud.dto.RequisicaoProd;
import com.gerenhoteleiro.crud.repository.ProdutosRepository;

@Service
public class ProdutosService {
    @Autowired
    private ProdutosRepository produtosRepository;
    
    public Produtos salvaProdutos (RequisicaoProd req) {
        Produtos f = new Produtos();

        f.setIdProdutos(1);
        f.setNome("12");
        f.setValor(12);
        f.setTipo("12");
        f.setIdConsumo(12);
        f.setCategoria_idCategoria(12);
        produtosRepository.save(f);
        return f;
    }
}