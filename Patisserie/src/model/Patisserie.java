/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leperrot
 */
public class Patisserie {
    
    //private final List<Client> fileAttente;
    private final List<Gateau> gateaux;
    
    public Patisserie(){
        //fileAttente = new ArrayList<>();
        gateaux = new ArrayList<>();
    }
    
    public synchronized void depose(Gateau g){
        gateaux.add(g);
        if(gateaux.size()>=1) notify();
    }
    
    public synchronized Gateau achete() throws InterruptedException{
        while(gateaux.isEmpty()){
            wait();
        }
        return gateaux.remove(gateaux.size()-1);
    }
    
    public int getStock(){
        return gateaux.size();
    }
    
}
