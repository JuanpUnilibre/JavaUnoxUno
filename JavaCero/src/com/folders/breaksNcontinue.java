package com.folders;

public class breaksNcontinue {
    /*
    * Ejercicio 01 — break y continue
    * Dificultad 3/10
    * Construye un programa que recorra los números del 1 al 20.
    *
    * Requisitos:
    * - Utiliza continue para omitir los números pares.
    * - Utiliza break cuando el contador llegue a 15.
    * - Imprime los números restantes.
    *
    * */

    public static void main() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i==15) {
                break;
            }
            System.out.println(i);
        }
    }
}
