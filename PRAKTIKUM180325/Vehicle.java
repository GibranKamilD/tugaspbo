/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM180325;

/**
 *
 * @author gibra
 */
public class Vehicle {
    public double Load;
    public double maxLoad;
    
    public Vehicle(double maxLoad){ //konstruktor
        this.maxLoad = maxLoad;
        
    }
    
    public double getLoad(){
        return Load;
    }
    
    public double getMaxLoad(){
        return maxLoad;
    }
    
}
