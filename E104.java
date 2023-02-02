package com.Replit;

import java.util.Scanner;

public class E104 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the names: ");
            names[i] = input.next();
        }

        for (int i = 0; i < 5; i++) {
            String trimmed  = names[i].substring(0, 3);
            System.out.println(trimmed);
        }

    }
}
