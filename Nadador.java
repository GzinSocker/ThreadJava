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
public class Nadador extends Thread{
    private double nadada, runned=0;
    //private double[] vel = {1, 0.8, 0.6};
    private int aux=1;
    static int num;
    public Nadador(int n){
        num++;
        nadada = n;
    }
    public void run(){
        while(runned<100){
            runned+=nadada;
            System.out.print(num);
        }
    }
    
}
