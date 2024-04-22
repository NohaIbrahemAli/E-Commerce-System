/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author system 2023
 */
public class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = Math.abs(customerId);
        this.name = name;
        this.address = address;
    }
   
    public Customer()
    {
        customerId = 23012140;
        name = "Noha Ibrahem";
        address = "Miami";
    }

    public void setcustomerId(int cu)
    {
        customerId = cu;
    }
    
    public void setname(String na)
    {
        name = na;
    }
    
    public void setaddress(String ad)
    {
        address = ad;
    }
    
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    
}

