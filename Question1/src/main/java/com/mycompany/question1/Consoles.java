/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author triva
 */

    public abstract class Consoles implements IConsole
{
    // Variables to store the console information
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor
    public Consoles(String consoleType, String store, int totalSales)
    {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getter for the console type
    @Override
    public String getConsoleType()
    {
        return consoleType;
    }

    // Getter for the store name
    @Override
    public String getStore()
    {
        return store;
    }

    // Getter for the total sales
    @Override
    public int getTotalSales()
    {
        return totalSales;
    }

    // Abstract method that the subclass must implement
    public abstract void printReport();
}

