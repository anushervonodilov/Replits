package com.Replit;

import java.util.Scanner;

public class E095 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();

        String trimmed =  word.substring(0, 3);
        System.out.println(trimmed);

    }
}
