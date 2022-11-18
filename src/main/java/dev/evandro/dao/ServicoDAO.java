package dev.evandro.dao;

import org.springframework.data.repository.CrudRepository;

import dev.evandro.model.Servico;

public interface ServicoDAO extends CrudRepository<Servico, Integer>{

}
