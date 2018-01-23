/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author leperrot
 */
public class Client implements Runnable{

    private final String nom;
    private final Patisserie patisserie;

    public Client(String nom, Patisserie patisserie) {
        this.nom = nom;
        this.patisserie = patisserie;
    }
    
    @Override
    public void run() {
        try {
            Gateau g = patisserie.achete();
        } catch (InterruptedException ex) {
            System.out.println("Le client " + nom + " peut acheter un gateau");
        }
        System.out.println("Le client " + nom + " a acheté un gateau");
    }
    
}
