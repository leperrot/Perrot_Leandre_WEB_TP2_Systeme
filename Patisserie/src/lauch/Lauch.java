/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lauch;

import model.Client;
import model.Patisserie;
import model.Patissier;

/**
 *
 * @author leperrot
 */
public class Lauch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patisserie patisserie = new Patisserie();
        Thread pat1 = new Thread(new Patissier("Gérard",patisserie));
        //Thread pat2 = new Thread(new Patissier("Jean",patisserie));
        
        Thread cli1 = new Thread(new Client("Michel",patisserie));
        Thread cli2 = new Thread(new Client("Maria",patisserie));
        Thread cli3 = new Thread(new Client("Ben",patisserie));
        Thread cli4 = new Thread(new Client("Linda",patisserie));
        Thread cli5 = new Thread(new Client("Samuel",patisserie));
        Thread cli6 = new Thread(new Client("Tom",patisserie));
        
        
        pat1.start();
        cli1.start();
        //pat2.start();
        cli2.start();
        cli3.start();
        cli4.start();
        cli5.start();
        cli6.start();
    }
    
}
