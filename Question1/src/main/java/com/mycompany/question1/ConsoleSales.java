/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author triva
 */
public class ConsoleSales extends Consoles
{
    // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales)
    {
        super(consoleType, store, totalSales);
    }

    // Prints the console sales report
    @Override
    public void printReport()
    {
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE:        " + getStore());
        System.out.println("TOTAL SALES:  " + getTotalSales());
        System.out.println("----------------------------------------");
    }
}
