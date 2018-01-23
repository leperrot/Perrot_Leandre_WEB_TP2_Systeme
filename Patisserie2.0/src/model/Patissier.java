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

    private final String nom;
    private final Patisserie patisserie;
    
    public Patissier(String nom, Patisserie patisserie){
        this.nom = nom;
        this.patisserie = patisserie;
    }
    
    @Override
    public void run() {
        //while(patisserie.getStock()<10){
        while(true){
            try {
                patisserie.depose(new Gateau(12.00));
                System.out.println("Le patissier " + nom + " a ajouté un gateau");
            } catch (InterruptedException ex) {
                System.out.println("Le patissier " + nom + " peut ajouter un gateau");
            } catch (Exception ex) {
                return;
            }
        }
    }
    
}
