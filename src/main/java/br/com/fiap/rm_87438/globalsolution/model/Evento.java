package br.com.fiap.rm_87438.globalsolution.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String local;
    private String acontecimento;
    private Integer pessoasImpactadas;
    private LocalDate data;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getAcontecimento() {
        return acontecimento;
    }
    public void setAcontecimento(String acontecimento) {
        this.acontecimento = acontecimento;
    }
    public Integer getPessoasImpactadas() {
        return pessoasImpactadas;
    }
    public void setPessoasImpactadas(Integer pessoasImpactadas) {
        this.pessoasImpactadas = pessoasImpactadas;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }




}
