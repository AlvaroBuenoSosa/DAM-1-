package org.example;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bienvenido a Carbonita Volando ");
        System.out.print("Introduzca el peso de su figura en gramos: ");
        int gramos = sc.nextInt();
        System.out.print("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        int material = sc.nextInt();
        System.out.print("¿Quiere posprocesado? (1=si, 2=no): ");
        int posprocesado = sc.nextInt();
        System.out.print("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        int premiun = sc.nextInt();

        double precioGramo;
        double resultado;

        if (material == 1) {
            precioGramo = 0.2;
        } else if (material == 2) {
            precioGramo = 0.3;
        } else if (material == 3) {
            precioGramo = 0.5;
        } else if (material == 4) {
            precioGramo = 0.7;
        } else {
            System.out.println("Material no válido");
            sc.close();
            return;
        }

        resultado = gramos * precioGramo;

        if (posprocesado == 1){
            resultado = resultado + 3;
        }else{
            System.out.println("nada");
        }

        if (premiun == 2) {
            resultado = resultado + 2;
        } else if (premiun == 1) {
            System.out.println("Es usted premiun");
        }

        System.out.println( "El coste total de la pieza es:" + resultado + "€");

    }
}
