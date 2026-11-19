package com.folders;

public class ciclos {
    public static void main() {
        int cantidadPares = 0;

        System.out.println("=====================");
        System.out.println("    Contador Java    ");
        System.out.println("=====================");

        System.out.println("\nNumeros del 1 al 20:\n");

        for(int i=1;i<=20;i++) {
            System.out.println(i);
        }

        System.out.println("\nNumeros pares:");

        for (int i=1;i<=20;i++) {
            if(i%2==0) {
                System.out.println(i);

                cantidadPares++;
            }
        }

        System.out.println("\nCantidad de pares: " + cantidadPares);

        System.out.println("=====================");
    }
}