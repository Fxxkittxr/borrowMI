package br.univille.fsoweb20242borrowmi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Necessidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 3000, nullable = false)
    private String tituloNecessidade;
    @Column(length = 3000, nullable = false)
    private String descricaoNecessidade;
    @Column(length = 3000)   
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNecessidade; 
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataFimNecessidade;
    

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTituloNecessidade() {
        return tituloNecessidade;
    }
    public void setTituloNecessidade(String tituloNecessidade) {
        this.tituloNecessidade = tituloNecessidade;
    }
    public String getDescricaoNecessidade() {
        return descricaoNecessidade;
    }
    public void setDescricaoNecessidade(String descricaoNecessidade) {
        this.descricaoNecessidade = descricaoNecessidade;
    }
    public Date getDataNecessidade() {
        return dataNecessidade;
    }
    public void setDataNecessidade(Date dataNecessidade) {
        this.dataNecessidade = dataNecessidade;
    }
    public Date getDataFimNecessidade() {
        return dataFimNecessidade;
    }
    public void setDataFimNecessidade(Date dataFimNecessidade) {
        this.dataFimNecessidade = dataFimNecessidade;
    } 

    
}
