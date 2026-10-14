package org.example;

import java.util.Scanner;

public class piramideNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Imprimir los espacios
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Imprimir los números ascendentes
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Imprimir los números descendentes
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}

