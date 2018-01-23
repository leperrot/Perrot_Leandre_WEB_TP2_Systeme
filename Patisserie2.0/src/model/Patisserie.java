/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**c
 *
 * @author leperrot
 */
public class Patisserie {
    
    private final BlockingQueue<Gateau> gateaux;
    private int cpt = 0;
    
    public Patisserie(){
        gateaux = new ArrayBlockingQueue(10);
    }
    
    public void depose(Gateau g) throws InterruptedException, Exception{
        if(cpt == 20) throw new Exception();
        gateaux.put(g);
    }
    
    public Gateau achete() throws InterruptedException{
        if(cpt == 20)
            return Gateau.GATEAU_EMPOISONNE;
        cpt++;
        return gateaux.take();
    }
    
    public int getStock(){
        return gateaux.size();
    }
    
}
