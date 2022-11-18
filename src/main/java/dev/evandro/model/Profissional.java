package dev.evandro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_profissional")
public class Profissional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_profissional")
	private Integer idProfissional;
	
	@Column(name = "nome", length=50, nullable=false)
	private String nome;
	
	@Column(name = "profissional", length=50, nullable=false)
	private String profissao;

	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
