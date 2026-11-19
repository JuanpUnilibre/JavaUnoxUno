package com.folders;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Nombre del producto: ");
       String nombre;
       nombre = sc.nextLine();

       System.out.println("\nPrecio del producto: ");
       double precio;
       precio  = sc.nextDouble();

       System.out.println("\nCantidad: ");
       int cantidad;
       cantidad = sc.nextInt();

       System.out.println("\n¿Está disponible? (true/false) ");
       boolean disponible = sc.nextBoolean();

       double total = cantidad * precio;

        System.out.println("\n=============================");
        System.out.println("     FACTURA DE COMPRA     ");
        System.out.println("=============================");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Disponible: " + disponible);
        System.out.println("------------------");
        System.out.println("Total: " + total);
        System.out.println("=============================");



    }

}
