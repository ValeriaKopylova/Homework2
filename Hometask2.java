/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.hometask2;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 *
 * @author Acer
 */
public class Hometask2 {

    public static void main(String[] args) {
        System.out.println("Копылова Валерия Анатольевна РИБО-02-21 вариант 5");
        System.out.println("Введите 1, чтобы выбрать магазин одежды,2- чтобы выбрать магазин техники");
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();
        if (select == 1){
            System.out.println("Введите название магазина");
            String storeName = scan.nextLine();
            
            System.out.println("Введите улицу");
            String street = scan.nextLine();
            
            String z = scan.nextLine();
            System.out.println("Введите количество работников");
            int workers = scan.nextInt();
            
            System.out.println("Введите количество прибыли");
            int revenue = scan.nextInt();
            
            System.out.println("Введите количество проданных носков");
            int numberOfSockssSold = scan.nextInt();
            
            ClothesStore firstsub = new ClothesStore(storeName, street, workers, revenue, numberOfSockssSold);
            
            firstsub.setStoreName(storeName);
            firstsub.setRevenue(revenue);
            firstsub.setStreet(street);
            firstsub.setWorkers(workers);
            String result =firstsub.toString();
            System.out.println(result);
        }
        if (select == 2){
           System.out.println("Введите название магазина");
            String storeName = scan.nextLine();
            
            System.out.println("Введите улицу");
            String street = scan.nextLine();
            
            String z = scan.nextLine();
            System.out.println("Введите количество работников");
            int workers = scan.nextInt();
            
            System.out.println("Введите количество прибыли");
            int revenue = scan.nextInt();
            
            System.out.println("Введите количество бракованного товара");
            int theNumberOfDefectiveEquipment = scan.nextInt(); 
            
            HardwareStore secondsub = new HardwareStore(storeName, street, workers, revenue, theNumberOfDefectiveEquipment);
            
            secondsub.setRevenue(revenue);
            secondsub.setStoreName(storeName);
            secondsub.setStreet(street);
            secondsub.setWorkers(workers);
            
            String result = secondsub.toString();
            System.out.println(result);
        }  
    }
}
