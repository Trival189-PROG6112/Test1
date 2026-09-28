/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author triva
 */
import java.util.Scanner;

public class RunApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int choice;
        String consoleType = "";

        System.out.println("SELECT A GAMING CONSOLE");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");
        System.out.print("Enter your choice: ");

        choice = Integer.parseInt(input.nextLine());

        // Determine which console the user selected
        switch (choice)
        {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "NINTENDO SWITCH";
                break;

            default:
                System.out.println("Invalid console selection.");
                input.close();
                return;
        }

        System.out.print("Enter the store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = Integer.parseInt(input.nextLine());

        // Create an object of the ConsoleSales subclass
        ConsoleSales sales =
                new ConsoleSales(consoleType, storeName, totalSales);

        System.out.println();

        // Display the report
        sales.printReport();

        input.close();
    }
}
