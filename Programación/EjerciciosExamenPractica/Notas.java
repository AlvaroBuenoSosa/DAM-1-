package org.example;

public class Notas {
        public static void main(String[] args) {

            String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};

            // Número de notas: 4, 8, 12, 16, 20, 24 o 28
            int cantidad = ((int) (Math.random() * 7) + 1) * 4;

            int primeraNota = (int) (Math.random() * 7);

            for (int i = 0; i < cantidad; i++) {

                int nota;

                if (i == cantidad - 1) {

                    nota = primeraNota;
                } else if (i == 0) {
                    nota = primeraNota;
                } else {

                    nota = (int) (Math.random() * 7);
                }

                System.out.print(notas[nota] + " ");

                if ((i + 1) % 4 == 0) {
                    if (i == cantidad - 1) {
                        System.out.print("||");
                    } else {
                        System.out.print("| ");
                    }
                }
            }
        }
    }

