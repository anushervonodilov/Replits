package com.Replit;

public class E118 {

    String space = "";
    public String spaceOut(String s) {
        for (int i = 0; i < s.length(); i++) {
            space += s.charAt(i) + " ";
        }
        return space;
    }

    public static void main(String[] args) {

        E118 e118 = new E118();
        System.out.println(e118.spaceOut("hello"));

    }

}
