package br.com.fiap.rm_87438.globalsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.rm_87438.globalsolution.model.Evento;

@Repository
public interface EventoRepository 
            extends JpaRepository<Evento, Long>{
}
