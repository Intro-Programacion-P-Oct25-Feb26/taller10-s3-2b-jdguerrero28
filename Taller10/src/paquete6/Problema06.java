/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] matrizOriginal = new double[5][6];
        double[][] matrizResultante = new double[5][6];
        double numero;
        String reporte = "";

        System.out.println("Ingrese el numero para multiplicar:");
        numero = entrada.nextDouble();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("Ingrese datos Matriz [%d][%d]: ", i, j);
                matrizOriginal[i][j] = entrada.nextDouble();

                matrizResultante[i][j] = matrizOriginal[i][j] * numero;
            }
        }

        reporte = String.format("MATRIZ ORIGINAL\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                reporte = String.format("%s%.2f\t", reporte,
                        matrizOriginal[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMATRIZ RESULTANTE\n",
                reporte, numero);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                reporte = String.format("%s%.2f\t", reporte,
                        matrizResultante[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        System.out.printf("\n%s", reporte);
    }
}
