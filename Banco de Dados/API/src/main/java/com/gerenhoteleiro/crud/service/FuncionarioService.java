package com.gerenhoteleiro.crud.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenhoteleiro.crud.domain.Funcionario;
import com.gerenhoteleiro.crud.dto.RequisicaoFunc;
import com.gerenhoteleiro.crud.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario salvaFuncionario (RequisicaoFunc req) {
		Funcionario f = new Funcionario();
		//f.setCpf(req.getCpf());
		//f.setDataAdmissao(req.getDataAdmissao());
		//f.setDataNascimento(req.getDataNascimento());
		//f.setNome(req.getNome());
		//f.setRg(req.getRg());
		f.setNome("Teste");
		f.setIdFuncionario(1);
		f.setRg(47406217);
		f.setDataNascimento(new Date());
		f.setDataAdmissao(new Date());
		f.setCpf(123456789);
		funcionarioRepository.save(f);
		return f;
	}

}
