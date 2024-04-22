/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author system 2023
 */
public class ClothingProduct extends Products{
    private String size;
    private String fabric;

    public ClothingProduct(int productId, String name, double price, String size, String fabric) {
        super(productId, name, price);
        this.size = size;
        this.fabric = fabric;
    }
     
    public void setsize(String s)
    {
        size = s;
    }
    
    public void setfabric(String f)
    {
        fabric = f;
    }
    
    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }
}  

