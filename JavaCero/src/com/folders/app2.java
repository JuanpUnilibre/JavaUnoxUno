package com.folders;

import java.util.Scanner;

public class app2 {
    public static void main() {
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        double promedio;
        String estado = "";
        String clasificacion = "";


        Scanner sc = new Scanner(System.in);


        System.out.println("Nombre del estudiante: ");
        nombre = sc.nextLine();

        System.out.println("\nPrimera nota: (recuerda que debe ser un número decimal con coma (5,0) ");
        nota1 = sc.nextDouble();

        System.out.println("\nSegunda nota");

        nota2 = sc.nextDouble();

        System.out.println("\nTercera nota");
        nota3 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3 ;

        if (promedio < 3.0) {
            clasificacion = estado = "Reprobado";
        } else if (promedio >= 3.0 && promedio < 4.0) {
            clasificacion = estado = "Aprobado";
        } else if (promedio >= 4.0 && promedio < 4.5) {
            clasificacion = "Sobresaliente";
            estado = "aprobado";
        } else if (promedio >= 4.5 && promedio <= 5.0) {
            clasificacion = "Excelente";
            estado = "aprobado";
        }


        if(
                (nota1 >= 0.0 && nota1 <= 5.0 ) &&
                (nota2 >= 0.0 && nota2 <= 5.0) &&
                (nota3 >= 0.0 && nota3 <= 5.0))
        {
            System.out.println("\n=============================");
            System.out.println("     SISTEMA ACADEMICO     ");
            System.out.println("=============================");
            System.out.println("Nombre: " + nombre);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " +  nota2);
            System.out.println("Nota 3: " +   nota3 );
            System.out.println("Promedio: " + promedio );
            System.out.println("Clasificacion: " + clasificacion );
            System.out.println("Estado: " + estado );
            System.out.println("=============================");
        } else {
            System.out.print("Todas las notas deben ser positivas, ANIMAL!");
        }
    }
}
