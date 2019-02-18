package com.company.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<Item>();
        ArrayList<Invoice> invoices = new ArrayList<Invoice>();

        System.out.print("Enter your name: ");
        String  name = input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter the date: ");
        String date = input.next();
        System.out.print("Enter your account number: ");
        String accountNumber = input.next();
        System.out.println();
        invoices.add(new Invoice(name, address, date, accountNumber));


        double salesTax=0;
        double totalTax = 0;
        String addMore = "";
        do{
            System.out.print("Enter item name: ");
            String item = input.next();
            System.out.print("Price: ");
            double price = input.nextDouble();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            System.out.print("Taxable (true or false): ");
            boolean isTaxable = input.nextBoolean();

            if(isTaxable){
                System.out.print("Enter your state: ");
                String state = input.next();
                Item anItem = new Item();
                salesTax = anItem.getTax(state);
                totalTax += salesTax * price * quantity;
            }

            items.add(new Item(item, price, quantity, isTaxable));
            System.out.print("Add another item: ");
            addMore = input.next();
            System.out.println();
        }while (!addMore.equalsIgnoreCase("no"));


        // Printing out customer details
        for (Invoice invoice:invoices) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Customer name: " + invoice.getCustomerName());
            System.out.println("Address: " + invoice.getAddress());
            System.out.println("Date: " + invoice.getDate());
            System.out.println("Account number: " + invoice.getAccountNumber());
            System.out.println("----------------------------------------------------------------------");
        }
        System.out.println();


        // Formatting numbers to 2 decimal points using decimal format.
        DecimalFormat df2 = new DecimalFormat( "#.00" );

        // Printing out items
        double subTotal = 0;
        System.out.println("Item Name     Quantity       Price          Cost           Taxable  ");
        System.out.println("=========================================================================");
        for (Item item: items){
            System.out.println(item.getName() + "\t\t\t " + item.getQuantity() +
                    "\t\t\t " + item.getPrice() + "\t\t " + df2.format(item.getCost
                    ()) +
                    "\t\t\t " + item.isTaxable());
            subTotal += item.getCost();
        }

        System.out.println("Subtotal $" + df2.format(subTotal));
        System.out.println("Sales Tax $"  + df2.format(totalTax));
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Total $" + df2.format(subTotal + totalTax));
    }

}


