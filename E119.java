package com.Replit;

public class E119 {

    public String censorLetter(String s, char c) {

        String censored = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                censored += "*";
            } else {
                censored += s.charAt(i);
            }
        }
        return censored;
    }

    public static void main(String[] args) {

        E119 e119 = new E119();
        System.out.println(e119.censorLetter("computer", 'o'));
        System.out.println(e119.censorLetter("trick or treat",'t'));

    }

}
