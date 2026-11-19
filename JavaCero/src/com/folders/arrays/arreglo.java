package com.folders.arrays;

public class arreglo {
    public static void main() {
        int array[] = new int[5];

        array[0] = 12;
        array[1] = 25;
        array[2] = 8;
        array[3] = 40;
        array[4] = 15;

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " ");
        }


        System.out.println("\nCantidad de elementos : " + array.length);
    }
}
