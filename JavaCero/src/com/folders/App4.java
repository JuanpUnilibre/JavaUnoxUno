package com.folders;


public class App4 {
    public static void main() {

        try {

            double nota = Double.parseDouble("hola");

        } catch (NumberFormatException e) {

            System.out.println("Debes introducir un numero.");

        }

    }
}
