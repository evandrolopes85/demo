package dev.evandro.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_profissional_servico")
public class ProfissionalServico{

	@EmbeddedId
	private ProfissionalServicoId profissionalServicoId;

	public ProfissionalServicoId getProfissionalServicoId() {
		return profissionalServicoId;
	}

	public void setProfissionalServicoId(ProfissionalServicoId profissionalServicoId) {
		this.profissionalServicoId = profissionalServicoId;
	}

	public ProfissionalServico(ProfissionalServicoId profissionalServicoId) {
		super();
		this.profissionalServicoId = profissionalServicoId;
	}

	public ProfissionalServico() {
		super();
	}

//	@MapsId("profissional")
//	@ManyToOne
//	@JoinColumn(name = "tbl_profissional_id_profissional", insertable = false, updatable = false)
//	private Profissional profissional;
//	
//	
//	@MapsId("servico")
//	@ManyToOne
//	@JoinColumn(name = "tbl_servico_id_servico", insertable = false, updatable = false)
//	private Servico servico;
//	
//	public ProfissionalServicoId getProfissionalServicoId() {
//		return profissionalServicoId;
//	}
//
//	public void setProfissionalServicoId(ProfissionalServicoId profissionalServicoId) {
//		this.profissionalServicoId = profissionalServicoId;
//	}
//
//	public Profissional getProfissional() {
//		return profissional;
//	}
//
//	public void setProfissional(Profissional profissional) {
//		this.profissional = profissional;
//	}
//
//	public Servico getServico() {
//		return servico;
//	}
//
//	public void setServico(Servico servico) {
//		this.servico = servico;
//	}
//
//	
//	public ProfissionalServico(ProfissionalServicoId profissionalServicoId, Profissional profissional,
//			Servico servico) {
//		super();
//		this.profissionalServicoId = profissionalServicoId;
//		this.profissional = profissional;
//		this.servico = servico;
//	}
//
//	public ProfissionalServico() {
//		super();
//	}
//	
}
