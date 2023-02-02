package com.Replit;

public class E120 {

    int year;
    String school;
    int batch;

    E120(int sYear, String sSchool, int sBatch) {
        year = sYear;
        school = sSchool;
        batch = sBatch;
    }

    void printInfo() {
        System.out.println("I am a student of batch " + batch + " studying at " + school + " in the year of " + year);
    }

    public static void main(String[] args) {

        E120 e120 = new E120(2021, "Syntax", 9);
        e120.printInfo();

    }

}
