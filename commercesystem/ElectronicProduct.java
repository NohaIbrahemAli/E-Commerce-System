/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author system 2023
 */
public class ElectronicProduct extends Products{
    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct(int productId, String name, double price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    
    public void setbrand(String br)
    {
      brand = br;  
    }
    
    public void setwarrantyPeriod(int w)
    {
      warrantyPeriod= w;  
    }
    
    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}

