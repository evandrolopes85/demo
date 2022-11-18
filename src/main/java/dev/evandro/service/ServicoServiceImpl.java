package dev.evandro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.evandro.dao.ServicoDAO;
import dev.evandro.model.Servico;

@Component
public class ServicoServiceImpl implements IServicoService{

	@Autowired
	private ServicoDAO dao;
	
	@Override
	public Servico recuperarServicoPorId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

}
