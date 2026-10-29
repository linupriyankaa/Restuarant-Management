
package com.rest.payment;

import java.util.Scanner;

public class  cardpay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== RESTAURANT PAYMENT =====");

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter food bill amount: ");
        double amount = sc.nextDouble();

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Card Payment");
        System.out.println("2. Cash Payment");
        System.out.println("3. UPI Payment");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.println("\n===== BILL DETAILS =====");
        System.out.println("Customer Name: " + name);
        System.out.println("Food Bill: Rs. " + amount);

        if (amount <= 0) {
            System.out.println("Invalid bill amount!");
        } else {
            switch (choice) {
                case 1:
                    System.out.println("Payment Method: Card");
                    System.out.println("Amount: Rs. " + amount);
                    System.out.println("Payment Status: Successful");
                    break;

                case 2:
                    System.out.println("Payment Method: Cash");
                    System.out.println("Amount: Rs. " + amount);
                    System.out.println("Payment Status: Successful");
                    break;

                case 3:
                    System.out.println("Payment Method: UPI");
                    System.out.println("Amount: Rs. " + amount);
                    System.out.println("Payment Status: Successful");
                    break;

                default:
                    System.out.println("Invalid payment choice!");
            }
        }

        sc.close();
    }
}
