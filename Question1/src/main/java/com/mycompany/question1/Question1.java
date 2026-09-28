/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author triva
 */
public class Question1 {
    
     

    public static void main(String[] args) {
       
    {
        // Single-dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array containing the sales figures
        int[][] sales =
        {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int[] cityTotals = new int[cities.length];

        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");

        System.out.printf("%-20s", "");

        // Display the console headings
        for (String console : consoles)
        {
            System.out.printf("%-12s", console);
        }

        System.out.println();

        // Display each city's sales
        for (int row = 0; row < cities.length; row++)
        {
            System.out.printf("%-20s", cities[row]);

            for (int column = 0; column < consoles.length; column++)
            {
                System.out.printf("%-12d", sales[row][column]);

                // Calculate the total sales for the current city
                cityTotals[row] += sales[row][column];
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        // Assume the first city has the most sales
        int highestTotal = cityTotals[0];
        int highestCityIndex = 0;

        // Display totals and find the city with the highest total
        for (int i = 0; i < cities.length; i++)
        {
            System.out.printf("%-20s%d%n", cities[i], cityTotals[i]);

            if (cityTotals[i] > highestTotal)
            {
                highestTotal = cityTotals[i];
                highestCityIndex = i;
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestCityIndex]);
        System.out.println("------------------------------------------------------------");
    }
}
    }

