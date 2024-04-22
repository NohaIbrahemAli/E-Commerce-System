/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author system 2023
 */
public class Cart {
    private int customerId;
    private int nProducts;
    private Products[] products;

    public Cart(int customerId, int maxProducts) {
        this.customerId = Math.abs(customerId);
        this.products = new Products[maxProducts];
        this.nProducts = 0;
    }

    
    public void setcustomerId(int cus)
    {
        customerId = cus;
    }
    
    public void setnProducts(int nP)
    {
        nProducts = nP;
    }
    
    public void setCartProducts(Products[] products)
    {
        this.products = products;
    }
    
    public int getcustomerId()
    {
        return customerId;
    }
    
    public int getnProducts()
    {
        return nProducts;
    }
    
    public Products[] getCartProducts() {
        return products;
    }
    
    public void addProduct(Products product) 
    {
        if (nProducts < products.length) {
            products[nProducts++] = product;
        } else {
            System.out.println("Cart is full. Cannot add more products.");
        }
    }
    
    

    public void removeProduct(int index) {
        if (index >= 0 && index < nProducts) {
            for (int i = index; i < nProducts - 1; i++) {
                products[i] = products[i + 1];
            }
            nProducts--;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public double calculatePrice() {
        double totalPrice = 0;
        for (int i = 0; i < nProducts; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    public Order placeOrder() {
        return new Order(customerId, products, calculatePrice());
    }
}
