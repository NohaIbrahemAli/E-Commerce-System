/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author system 2023
 */
public class Products {
    private int productId;
    private String name;
    private double price;

    public Products(int productId, String name, double price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }

    public void setproductId(int p)
    {
      productId = p;  
    }
    
    public void setname(String n)
    {
      name =n;  
    }
    
    public void setprice(double pr)
    {
      price = pr;  
    }
    
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

