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
public class Patissier implements Runnable{

    private String nom;
    private Patisserie patisserie;
    
    public Patissier(String nom, Patisserie patisserie){
        this.nom = nom;
        this.patisserie = patisserie;
    }
    
    @Override
    public void run() {
        while(patisserie.getStock()<10){
            System.out.println("Le patissier " + nom + " ajoute un gateau");
            patisserie.depose(new Gateau(12.00));
        }
    }
    
}
