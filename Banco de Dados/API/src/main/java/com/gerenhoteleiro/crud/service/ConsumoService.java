package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Consumo;
import com.gerenhoteleiro.crud.dto.RequisicaoCon;
import com.gerenhoteleiro.crud.repository.ConsumoRepository;

@Service
public class ConsumoService {
    @Autowired
    private ConsumoRepository consumoRepository;
    
    public Consumo salvaConsumo (RequisicaoCon req) {
        Consumo f = new Consumo();
        f.setQuantidade(15);
        f.setIdConsumo(1);
        f.setHospedagem_idHospedagem(1);
        f.setProdutos_idProdutos(1);
        f.setValor(12);
		consumoRepository.save(f);
		return f;
	}

}
