package com.Replit;

public class E117 {

    public int sumEvenToX(int x) {

        int sum = 0;
        for (int i = 2; i <= x; i+=2) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {

        E117 e117 = new E117();
        System.out.println(e117.sumEvenToX(5));

    }

}
