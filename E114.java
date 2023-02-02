package com.Replit;

public class E114 {

    void add(int num1, int num2) {
        System.out.println("Addition " + (num1 + num2));
    }

    void mult(int num1, int num2) {
        System.out.println("Multiplication " + (num1 * num2));
    }

    void subt(int num1, int num2) {
        System.out.println("Subtraction " + (num1 - num2));
    }

    public static void main(String[] args) {

        E114 e114 = new E114();
        e114.add(20, 10);
        e114.mult(3, 10);
        e114.subt(30, 10);

    }

}
