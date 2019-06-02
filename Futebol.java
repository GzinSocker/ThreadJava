/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author _CASTILIN_
 */
public class Futebol extends Time{
    private String escudo;
        Random r  = new Random();

    public Futebol(){
        dataCriacao = new Date();
    }
    public Futebol(String escudo, int numeroJogadores, String sede, Date dataCriacao){
        this.escudo = escudo;
        this.numeroJogadores = numeroJogadores;
        this.sede = sede;
        this.dataCriacao = dataCriacao;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    
    public String joga(){
        dataCriacao.setMonth(r.nextInt(7)+6);
        dataCriacao.setDate(r.nextInt(30)+1);
        return dataCriacao.toString();
    }
    public String imprime(){
        return "vc chamou a funcao imprime";
    }
}
