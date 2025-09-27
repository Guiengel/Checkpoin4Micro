package br.com.fiap.rm_87438.globalsolution.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.rm_87438.globalsolution.dto.EventoRequestCreate;
import br.com.fiap.rm_87438.globalsolution.dto.EventoRequestUpdate;
import br.com.fiap.rm_87438.globalsolution.dto.EventoResponse;
import br.com.fiap.rm_87438.globalsolution.service.EventoService;




@RestController
@RequestMapping("eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public ResponseEntity<EventoResponse> create(
        @RequestBody EventoRequestCreate dto){
            return ResponseEntity.status(201).body(
                new EventoResponse().toDto(
                    eventoService.createEvento(dto)
                )
            );
        } 
    
    @PutMapping("/{id}")
    public ResponseEntity<EventoResponse> update (@PathVariable Long id, @RequestBody EventoRequestUpdate dto){
        return eventoService.updateEvento(id, dto)
        .map(p -> new EventoResponse().toDto(p))
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        boolean result = eventoService.deleteEvento(id);
        if (result){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoResponse> getEventoById (@PathVariable Long id){
        return eventoService.getEventoById(id)
        .map(p -> new EventoResponse().toDto(p))
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<EventoResponse>>findAll(){
        List<EventoResponse> response =
        eventoService.getAll().stream()
        .map(p -> new EventoResponse().toDto(p))
        .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }
    
}
