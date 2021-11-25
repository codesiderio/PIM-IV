package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Categoria;
import com.gerenhoteleiro.crud.dto.RequisicaoCat;
import com.gerenhoteleiro.crud.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    public Categoria salvaCategoria (RequisicaoCat req) {
        Categoria f = new Categoria();
        f.setDescricao("Teste");
        f.setIdCategoria(1);
        f.setSetor("123456789");
		categoriaRepository.save(f);
		return f;
	}

}
