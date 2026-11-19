package com.folders;

import java.util.Scanner;

public class forAnidados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el numero de (*) que quieres: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {

            System.out.printf(i + ". ");

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }
}

/*
*
*
*
*
*
* */
