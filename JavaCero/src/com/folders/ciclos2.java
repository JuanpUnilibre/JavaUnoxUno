package com.folders;

public class ciclos2 {
    public static void main() {
        int numero = 1;
        int suma = 0;

        System.out.println("=====================");
        System.out.println("    Suma con While    ");
        System.out.println("=====================");

        while (numero <= 100) {
            suma = suma + numero;
            numero++;
        }

        
        System.out.println("Suma de los numeros del 1 al 100: " + suma);
        System.out.println("=====================");


    }
}
