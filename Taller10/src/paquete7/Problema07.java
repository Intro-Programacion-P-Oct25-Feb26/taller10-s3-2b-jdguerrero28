/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Locale;
import java.util.Scanner;

public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        String reporte = "";
        int diferencias = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Ingrese valor para Matriz X [%d][%d]: ", i, j);
                matrizX[i][j] = entrada.nextDouble();

                matrizA[i][j] = (matrizX[i][j] + 1) * (matrizX[i][j] + 1);
                matrizB[i][j] = (matrizX[i][j] * matrizX[i][j]) + (2 * matrizX[i][j]) + 1;
            }
        }

        reporte = String.format("MATRIZ X (Datos Ingresados)\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                reporte = String.format("%s%.2f\t", reporte, matrizX[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMATRIZ A (Calculo: (x+1)*(x+1))\n", reporte);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                reporte = String.format("%s%.2f\t", reporte, matrizA[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMATRIZ B (Calculo: x*x + 2*x + 1)\n", reporte);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                reporte = String.format("%s%.2f\t", reporte, matrizB[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    diferencias = diferencias + 1;
                }
            }
        }

        reporte = String.format("%s\n--- RESULTADO ---\n", reporte);
        if (diferencias == 0) {
            reporte = String.format("%sLa identidad algebraica se cumple\n", reporte);
        } else {
            reporte = String.format("%sLa identidad algebraica no se cumple\n", reporte);
        }

        System.out.printf("%s", reporte);
    }
}
