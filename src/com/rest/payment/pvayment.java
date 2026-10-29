
package com.rest.payment;

import java.util.Scanner;

public class pvayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== RESTAURANT PAYMENT =====");

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter food bill amount: ");
        double amount = sc.nextDouble();

        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Food Bill: Rs. " + amount);

        if (amount > 0) {
            System.out.println("Payment Status: Payment Successful");
            System.out.println("Thank you for visiting our restaurant!");
        } else {
            System.out.println("Invalid bill amount!");
        }

        sc.close();
    }
}
