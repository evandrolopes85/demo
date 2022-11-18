package dev.evandro.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.evandro.dto.ProfissionalServicoDTO;
import dev.evandro.service.IProfissionalServicoService;

@RestController
public class ProfissionalServicoController {

	@Autowired
	private IProfissionalServicoService service;

	
	@GetMapping("/servicorealizado")//{idProfissional}")
	public ResponseEntity<ArrayList<ProfissionalServicoDTO>> recuperarTodos(){//@PathVariable Integer idProfissional){
		//Integer servicoId = 1; 
		ArrayList<ProfissionalServicoDTO> res = service.recuperarTodos();//idProfissional, servicoId);
		
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		
		return ResponseEntity.badRequest().build();
	}
}
