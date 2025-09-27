package br.com.fiap.rm_87438.globalsolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.rm_87438.globalsolution.dto.EventoRequestCreate;
import br.com.fiap.rm_87438.globalsolution.dto.EventoRequestUpdate;
import br.com.fiap.rm_87438.globalsolution.model.Evento;
import br.com.fiap.rm_87438.globalsolution.repository.EventoRepository;



@Service
public class EventoService {
    
    @Autowired
    private EventoRepository eventoRepository;

    public Evento createEvento(EventoRequestCreate dto){
        return eventoRepository.save(dto.toModel());
    }

    public Optional<Evento> updateEvento(
        Long id, EventoRequestUpdate dto) {

    return eventoRepository.findById(id)
        .map(p -> eventoRepository.save(dto.toModel(p)));
    }

    public Optional<Evento> getEventoById(Long id) {        
        return eventoRepository.findById(id);
    }

    public List<Evento> getAll() {
        return eventoRepository.findAll();
    }

    public boolean deleteEvento(Long id) { 
        if (eventoRepository.existsById(id)) {
            eventoRepository.deleteById(id);
            return true;
        }
        return false;     
    }


}
