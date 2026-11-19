package com.folders;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;

public class ValidadorDeNotas {

    public static void main(String[] args) {
        double nota = 0;

        //creo el scanner
        Scanner sc = new Scanner(System.in);

        //ingreso la nota y la meto al scanner
        System.out.println("Ingrese una nota: ");
        String texto = sc.nextLine().trim();

        try{
            //arreglo el punto decimal
            texto = texto.replace(",", ".");

            //parseo el texto de la nota
            nota = Double.parseDouble(texto);

        } catch (NumberFormatException e) { //catch de formato numérico
            System.out.println("Error debe introducir un numero");
        }

        if(nota > 0.0 && nota < 5.0){ // condicion de intervalo correcto
            System.out.println("nota registrada: " + nota );
            System.out.println("Calificacion valida");
        } else if(nota < 0.0 || nota > 5.0) { // condicion de intervalo incorrecto
            System.out.println("nota registrada: " + nota );
            System.out.println("La nota debe estar entre 0.0 y 5.0");
        }
    }
}
