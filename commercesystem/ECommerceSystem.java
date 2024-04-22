/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e.commercesystem;
import java.util.Scanner;

/**
 *
 * @author system 2023
 */
public class ECommerceSystem {

    public static void main(String[] args) {

     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the E-Commerce System!");
        System.out.println("Please enter your id:");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Please enter your name:");
        String customerName = scanner.nextLine();
        System.out.println("Please enter your address:");
        String customerAddress = scanner.nextLine();
        Customer customer = new Customer(customerId, customerName, customerAddress);

        System.out.println("How many products you want to add to your cart?");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Cart cart = new Cart(customer.getCustomerId(), numProducts);

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            int productType = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (productType) {
                case 1:
                    cart.addProduct(new ElectronicProduct(1, "Smartphone", 599.99, "Samsung", 1));
                    break;
                case 2:
                    cart.addProduct(new ClothingProduct(2, "T-Shirt", 19.99, "Medium", "Cotton"));
                    break;
                case 3:
                    cart.addProduct(new BookProduct(3, "OOP", 39.99, "O'Reilly", "X Publications"));
                    break;
                default:
                    System.out.println("Invalid product choice!");
                    break;
            }
        }

        double totalPrice = cart.calculatePrice();
        System.out.println("Your total is $" + totalPrice + ". Would you like to place the order? 1- Yes 2- No");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (choice == 1) {
            Order order = cart.placeOrder();
            System.out.println("Here's your order's summary:");
            order.printOrderInfo();
        } else {
            System.out.println("Order not placed. Exiting...");
        }
    }
}

       
    


 

    

