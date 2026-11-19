package com.folders;

public class ciclosYcuadros {
    public static void main() {
        /*
        * Construye un programa que imprima una cuadrícula de 4 filas y 5 columnas.
        *
        *  * * * * *
        *  * * * * *
        *  * * * * *
        *  * * * * *
        *
        * */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
