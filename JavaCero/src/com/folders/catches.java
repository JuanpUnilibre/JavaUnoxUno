package com.folders;

import java.util.Scanner;

public class catches {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una nota: ");
        String texto = sc.nextLine().trim();
        double nota = 0;

        try
        {
            texto = texto.replace(",",".");

            nota = Double.parseDouble(texto);

        } catch (NumberFormatException e){
            System.out.println("Error");
        }

        boolean NotasAceptadas = nota > 0.0 && nota < 5.0;

        if(NotasAceptadas){
            System.out.println("Nota aceptada" + nota);
        } else if (!NotasAceptadas) {
            System.out.println("Nota invalida");
        }
    }
}
