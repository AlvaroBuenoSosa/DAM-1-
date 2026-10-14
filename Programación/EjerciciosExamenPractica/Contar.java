package org.example;

import java.util.Scanner;

public class Contar {
        static void main() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduzca una cadena: ");
            String cad = sc.nextLine();

            int contador = 0;

            for (int i = 0; i < cad.length(); i++) {
                char letra = Character.toLowerCase(cad.charAt(i));

                if (letra == ' ' ||
                        letra == 'h' ||
                        letra == 'a' || letra == 'á' ||
                        letra == 'e' || letra == 'é' ||
                        letra == 'o' || letra == 'ó') {

                    contador++;
                }
            }

            System.out.println("La cantidad de espacios, haches y vocales abiertas es "
                    + contador);

            sc.close();
        }
    }

