/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author system 2023
 */
public class Order {
    private int customerId;
    private Products[] products;
    private double totalPrice;

    public Order(int customerId, Products[] products, double totalPrice) {
        this.customerId = Math.abs(customerId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }

   
    
    public void printOrderInfo() {
        System.out.println("Order Details:");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (Products product : products) {
            System.out.println(" - " + product.getName());
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
