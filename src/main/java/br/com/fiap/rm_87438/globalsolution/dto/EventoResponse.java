package br.com.fiap.rm_87438.globalsolution.dto;

import java.time.LocalDate;

import br.com.fiap.rm_87438.globalsolution.model.Evento;


public class EventoResponse {
    private Long id;
    private String local;
    private String acontecimento;
    private Integer pessoasImpactadas;
    private LocalDate data;

    public EventoResponse toDto(Evento evento){
        this.setId(evento.getId());
        this.setLocal(evento.getLocal());
        this.setAcontecimento(evento.getAcontecimento());
        this.setPessoasImpactadas(evento.getPessoasImpactadas());
        this.setData(evento.getData());
        return this;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String getAcontecimento(){
        return acontecimento;
    }

    public void setAcontecimento(String acontecimento){
        this.acontecimento = acontecimento;
    }

    public Integer getPessoasImpactadas(){
        return pessoasImpactadas;
    }

    public void setPessoasImpactadas(Integer pessoasImpactadas){
        this.pessoasImpactadas = pessoasImpactadas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
