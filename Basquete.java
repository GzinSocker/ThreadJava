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
public class Basquete extends Time{
    private String regra;
    Random r  = new Random();
    public Basquete(){
        dataCriacao = new Date();
    }
    public Basquete(String regra, int numeroJogadores, String sede, Date dataCriacao){
        this.regra = regra;
        this.numeroJogadores = numeroJogadores;
        this.sede = sede;
        this.dataCriacao = dataCriacao;
    }

    public String getRegra() {
        return regra;
    }

    public void setRegra(String regra) {
        this.regra = regra;
    }
    
    public String joga(){
        dataCriacao.setMonth(r.nextInt(12)+1);
        dataCriacao.setDate(r.nextInt(30)+1);
        return dataCriacao.toString();
    }
    
     public String imprime(){
        return "vc chamou a funcao imprime";
    }
}
