package org.example;

public class Líneas {
    public static void main(String[] args) {

        char[] caracteres = {'*', '-', '=', '.', '|', '@'};

        for (int i = 0; i < 10; i++) {

            int aleatorio = (int) (Math.random() * 6);
            char caracter = caracteres[aleatorio];

            int longitud = (int) (Math.random() * 40) + 1;

            for (int j = 0; j < longitud; j++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
    }
}

