package com.folders;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menus {

    public static void main(String[] args) {
        boolean checked = false;
        int opcion;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("================");
                System.out.println("Menu de opciones");
                System.out.println("================");
                System.out.println("1. Chequear entorno de desarrollo");
                System.out.println("2. Desplegar");
                System.out.println("3. Salir");
                System.out.print("--> ");

                while (!sc.hasNextInt()) {
                    System.out.println("Opción inválida: debes ingresar un número.");
                    sc.nextLine();
                    System.out.print("--> ");
                }

                opcion = sc.nextInt();
                sc.nextLine(); // limpia el resto de la línea

                switch (opcion) {
                    case 1: {
                        if (!checked) {
                            System.out.println("\nrevisando recursos");

                            boolean exito = true;

                            try {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("...");
                                    TimeUnit.SECONDS.sleep(3);
                                }
                            } catch (InterruptedException e) {
                                exito = false;
                                Thread.currentThread().interrupt();
                                System.out.println("Error en el quantum de recursos");
                            }

                            if (exito) {
                                System.out.println("\n*******************************************");
                                System.out.println("Recursos corriendo de forma satisfactoria");
                                System.out.println("*******************************************");
                                checked = true;
                            }
                        } else {
                            System.out.println("Recursos ya revisados");
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("Compilando ...");
                        System.out.println("**8794bf**");

                        for (int t = 0; t < 15; t++) {
                            System.out.println("***ff16+8*" + t);
                        }
                        break;
                    }

                    case 3: {
                        System.out.println("apagando cluster");
                        System.out.println("cerrando");
                        System.out.println("Programa finalizado");
                        break;
                    }

                    default: {
                        System.out.println("Opción no válida. Elige 1, 2 o 3.");
                    }
                }

            } while (opcion != 3);
        }

        System.out.println("fuera del dowhile");
    }
}