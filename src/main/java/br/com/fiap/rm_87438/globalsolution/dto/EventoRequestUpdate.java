package br.com.fiap.rm_87438.globalsolution.dto;

import java.time.LocalDate;

import br.com.fiap.rm_87438.globalsolution.model.Evento;

public class EventoRequestUpdate {
    private String local;
    private String acontecimento;
    private Integer pessoasImpactadas;
    private LocalDate data;

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

    public Evento toModel(Evento evento){
        evento.setLocal(this.local);
        evento.setAcontecimento(this.acontecimento);
        evento.setPessoasImpactadas(this.pessoasImpactadas);
        evento.setData(this.data);
        return evento;
    }
}
