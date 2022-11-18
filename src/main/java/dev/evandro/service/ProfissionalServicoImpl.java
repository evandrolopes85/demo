package dev.evandro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.evandro.dao.ProfissionalServicoDAO;
import dev.evandro.dto.ProfissionalServicoDTO;

@Component
public class ProfissionalServicoImpl implements IProfissionalServicoService{

	@Autowired
	private ProfissionalServicoDAO dao;
	
	@Override
	public ArrayList<ProfissionalServicoDTO> recuperarTodos(){//Integer profissionalId, Integer servicoId) {
		// TODO Auto-generated method stub
//		ArrayList<ProfissionalServico> res = (ArrayList<ProfissionalServico>)dao.findAll();
	
		return dao.getAllProfissionalServico();//profissionalId, servicoId);
	}
	
}
