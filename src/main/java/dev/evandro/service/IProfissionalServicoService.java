package dev.evandro.service;

import java.util.ArrayList;

import dev.evandro.dto.ProfissionalServicoDTO;

public interface IProfissionalServicoService {
	public ArrayList<ProfissionalServicoDTO> recuperarTodos();//Integer profissionalId, Integer servicoId);
}
