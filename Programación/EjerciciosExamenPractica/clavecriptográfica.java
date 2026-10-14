
package org.example;

import java.util.Scanner;

public class clavecriptográfica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        String numero = sc.nextLine();

        int numeroResultante = 0;

        for (int i = 0; i < numero.length(); i++) {
            int cifra = numero.charAt(i) - '0';

            int clave = (int) (Math.random() * 9000) + 1000;

            System.out.println("La clave criptográfica generada para "
                    + cifra + " es: " + clave);

            int suma = cifra;
            int copiaClave = clave;

            while (copiaClave > 0) {
                int ultimaCifra = copiaClave % 10;
                suma = suma + ultimaCifra;
                copiaClave = copiaClave / 10;
            }

            System.out.println("La suma de las cifras totales para "
                    + cifra + " es: " + suma);

            numeroResultante = numeroResultante + suma;
        }

        System.out.println("El número resultante es: " + numeroResultante);

        sc.close();
    }
}

