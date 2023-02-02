package com.Replit;

public class E116 {

    boolean trueOrFalse(int num1, int num2) {

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

         E116 e116 = new E116();
         System.out.println(e116.trueOrFalse(4, 5));

    }

}
