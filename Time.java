/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;

/**
 *
 * @author _CASTILIN_
 */
public abstract class Time {
    protected int numeroJogadores;
    protected String sede;
    protected Date dataCriacao;

    public Time(){
        //this(0,'',dataCriacao);
    }
    
    public Time(int numeroJogadores, String sede, Date dataCriacao){
        this.numeroJogadores = numeroJogadores;
        this.sede = sede;
        this.dataCriacao = dataCriacao;
    }
    
    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public abstract String joga();
    public abstract String imprime();
    
    
}
