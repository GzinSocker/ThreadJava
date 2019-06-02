/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author _CASTILIN_
 */

public class Main {
    public static void main(String [] args){
        Time[] t = new Time[5];
        Random r = new Random();
        for(int i=0;i<5;i++){
            if(r.nextInt(2)==0){
                t[i] = new Futebol();
                System.out.println((i+1)+"º TIME\nProximo jogo: "+t[i].joga());
            }
            else t[i]=new Basquete();
        }
        
    }
}
