package dev.evandro.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import dev.evandro.dto.ProfissionalServicoDTO;
import dev.evandro.model.ProfissionalServico;

public interface ProfissionalServicoDAO extends CrudRepository<ProfissionalServico, Integer>{
	
	@Query("SELECT new "
			+ "dev.evandro.dto.ProfissionalServicoDTO(p.profissionalServicoId.profissional.idProfissional, p.profissionalServicoId.servico.idServico) "
			+ " FROM ProfissionalServico p")
//			+ " WHERE p.profissionalServicoId.profissional.idProfissional = :profissionalId AND"
//			+ "       p.profissionalServicoId.servico.idServico = :servicoId")
	public ArrayList<ProfissionalServicoDTO> getAllProfissionalServico();//@Param("profissionalId") Integer profissionalId, @Param("servicoId") Integer servicoId);
}



//from ItemPedido ip 
//where ip.itemPedidoID.idPedido = :idPedido 
//  and ip.itemPedidoID.indiceItem = :indice

//@Query("SELECT p.profissionalServicoId.idProfissional, p.profissionalServicoId.idServico FROM ProfissionalServico p")
//public ArrayList<ProfissionalServico> recuperarServicos();

//@Query("SELECT new "
//		+  "br.com.isiflix.backend.dto.AcompanhamentoDTO(a.idAcompanhamento.usuario.id, "
//		+ "                                              a.idAcompanhamento.serie.id, "
//		+ "                                              a.idAcompanhamento.episodio.id,"
//		+ "                                              a.dataHora) "
//		+ " FROM Acompanhamento a "
//		+ " WHERE a.idAcompanhamento.serie.id = :idSerie AND"
//		+ "       a.idAcompanhamento.usuario.id = :idUsuario")
//	public ArrayList<AcompanhamentoDTO> getAllBySerieAndUser(@Param("idSerie") Integer idSerie, @Param("idUsuario") Integer idUsuario)
