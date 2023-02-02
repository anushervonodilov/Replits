package com.Replit;

public class E126 {

    static int instanceCount = 0;

    public E126() {
        instanceCount++;
    }

    static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {

        E126 e1261 = new E126();
        E126 e1262 = new E126();
        E126 e1263 = new E126();
        System.out.println(E126.getInstanceCount());

    }

}
