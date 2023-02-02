package com.Replit;

public class E122 {

    String countryName;
    String capital;
    int population;

    E122(String printCountryName, String printCapitalName, int printPopulation) {
        countryName = printCountryName;
        capital = printCapitalName;
        population = printPopulation;
    }

    void printInfo() {
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + population);
    }

    public static void main(String[] args) {

        E122 e122a = new E122("USA", "Washington DC", 330000000);
        e122a.printInfo();

        E122 e122b = new E122("Kazakhstan", "Astana", 18500000);
        e122b.printInfo();

    }

}
