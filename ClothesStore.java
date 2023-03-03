/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hometask2;

/**
 *
 * @author Acer
 */
public class ClothesStore extends Store {
    private int numberOfSockssSold;

    public ClothesStore(String storeName, String street, int numberOfSockssSold, int workers, int revenue) {
        super(storeName, street, workers, revenue);
        this.numberOfSockssSold = numberOfSockssSold;
    }
    @Override
    public String toString(){
        String result = "ClothesStore:" + "store Name is"+ getStoreName()+"street is"+getStreet()+"Workers is"+getWorkers()+"people"+"Revenue is"+getRevenue()+"euro"+"number of socks sold is"+ this.numberOfSockssSold;
        return result;
    }
}
