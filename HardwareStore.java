/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hometask2;

/**
 *
 * @author Acer
 */
public class HardwareStore extends Store {
    private int theNumberOfDefectiveEquipment;

    public HardwareStore(String storeName, String street, int theNumberOfDefectiveEquipment, int workers, int revenue) {
        super(storeName, street, workers, revenue);
        this.theNumberOfDefectiveEquipment = theNumberOfDefectiveEquipment;
    }
     @Override
    public String toString(){
        String res = "HardwareStore:" + "store Name is"+ getStoreName()+"street is"+getStreet()+"Workers is"+getWorkers()+"people"+"Revenue is"+getRevenue()+"euro"+"the number of defective equipment is"+ this.theNumberOfDefectiveEquipment;
        return res;
}
}