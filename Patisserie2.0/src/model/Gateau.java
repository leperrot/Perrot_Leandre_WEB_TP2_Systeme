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
public class Gateau {
    
    private double prix;
    public static final Gateau GATEAU_EMPOISONNE = new Gateau(2.00);
    
    public Gateau(double prix){
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
