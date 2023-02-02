package com.Replit;

import java.util.Scanner;

public class E100 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        StringBuilder revS = new StringBuilder(s);
        revS.reverse();
        System.out.println(revS);

    }
}
