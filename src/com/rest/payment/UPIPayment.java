
package com.rest.payment;

import java.util.Scanner;

public class UPIpayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- UPI PAYMENT -----");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Food Bill Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter UPI ID: ");
        String upiId = sc.nextLine();

        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Food Bill: Rs. " + amount);
        System.out.println("Payment Method: UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Status: Payment Successful");
        System.out.println("Thank you for visiting our restaurant!");

        sc.close();
    }
}