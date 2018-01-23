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
public class Client implements Runnable {

    private final String nom;
    private final Patisserie patisserie;
    private final int CPT = 3;

    public Client(String nom, Patisserie patisserie) {
        this.nom = nom;
        this.patisserie = patisserie;
    }
    
    @Override
    public void run() {
        int cpt = 0;
        //while(cpt < CPT) {
        while(true){
            try {
                Gateau g = patisserie.achete();
                if(g.equals(Gateau.GATEAU_EMPOISONNE)){
                    System.out.println("Le client " + nom + " est décédé suite à un gateau pas bon");
                    return;
                }
                cpt++;
                System.out.println("Le client " + nom + " a acheté son " + cpt + " gateau");
            } catch (InterruptedException ex) {
                System.out.println("Le client " + nom + " peut acheter un gateau");
            }
        }
    }
}
