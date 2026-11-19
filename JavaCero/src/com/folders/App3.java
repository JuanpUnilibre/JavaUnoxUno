// Exceptions de Java

package com.folders;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una nota:");
        String texto = sc.nextLine().trim();

        try {

            // Normalizar separador decimal
            texto = texto.replace(',', '.');

            // Convertir String a double
            double nota = Double.parseDouble(texto);

            System.out.println("Nota registrada: " + nota);

            if (nota >= 0.0 && nota <= 5.0) {

                System.out.println("Nota valida.");

            } else {

                System.out.println("La nota debe estar entre 0 y 5.");

            }

        } catch (NumberFormatException e) {

            System.out.println("Error: debe introducir un numero valido.");

        }

        sc.close();

    }
}
