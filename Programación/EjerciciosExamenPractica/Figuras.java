package org.example;

import java.util.Scanner;

public class Figuras {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int altura;
        do {
            System.out.println("Introduce una altura mayor que 3 e impar:");
            altura = sc.nextInt();
        } while (altura <= 3 || altura % 2 == 0);

        for (int i = 0; i < altura; i++){
            for ( int j = 0; j < altura; j++) {
                if (i == 0 || i == altura - 1 || i + j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
        System.out.print("  ");

            for ( int j = 0; j < altura; j++){
                if (i == 0 || i == altura -1 || i + j == altura -1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

        }
            System.out.println();
            }
        }

    }

