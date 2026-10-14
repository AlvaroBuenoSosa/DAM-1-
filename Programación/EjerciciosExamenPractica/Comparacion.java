package org.example;

import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        long numero = sc.nextLong();

        System.out.print("Pares que aparecen en el número: ");

        for (int digito = 0; digito <= 9; digito++) {
            long copia = numero;
            boolean aparece = false;

            while (copia > 0) {
                long ultimoDigito = copia % 10;

                if (ultimoDigito == digito) {
                    aparece = true;
                }

                copia = copia / 10;
            }

            if (aparece && digito % 2 == 0) {
                System.out.print(digito + " ");
            }
        }

        System.out.println();
        System.out.print("Impares que aparecen en el número: ");

        for (int digito = 0; digito <= 9; digito++) {
            long copia = numero;
            boolean aparece = false;

            while (copia > 0) {
                long ultimoDigito = copia % 10;

                if (ultimoDigito == digito) {
                    aparece = true;
                }

                copia = copia / 10;
            }

            if (aparece && digito % 2 != 0) {
                System.out.print(digito + " ");
            }
        }

        sc.close();
    }
}