package org.example;

import java.util.Scanner;

public class ejercicioXE {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int altura;
        do {
            System.out.println("Introduce una altura mayor que 3 e impar:");
            altura = sc.nextInt();
        } while (altura <= 3 || altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == j || i + j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (int j = 0; j < altura; j++) {
                if (i == 0 || j == 0 || i == altura - 1 || i == altura / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (int j = 0; j < altura * 2 - 1; j++) {
                if (j == altura - 1 - i || j == altura - 1 + i || i == 4 && (j == altura - i - 2 || j == altura - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (int j = 0; j < altura; j++) {
                if ((i == 0 && j > 0 && j < altura - 1)
                        || (i == altura / 2 && j > 0 && j < altura - 1)
                        || (i == altura - 1 && j > 0 && j < altura - 1)
                        || j == 0
                        || j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (int j = 0; j < altura * 2 - 1; j++) {

                int fila;

                if (j < altura) {
                    fila = j;
                } else {
                    fila = 2 * altura - 2 - j;
                }

                for (int k = 0; k < altura * 2 - 1; k++) {

                    if (k == altura - 1 - fila
                            || k == altura - 1 + fila) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
                System.out.println();
            }
        }
    }
