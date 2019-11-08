package com.example.lib15;

public class MyClass {
    public static void main(String[] argv) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("input Hour :");
        int h = scanner.nextInt();
        System.out.println("input Min :");
        int m = scanner.nextInt();

        if ((h >= 7 && m >= 30) )
        {
            System.out.println("in School");
        }
        else
        {
            System.out.println("out School");
        }
    }
}
