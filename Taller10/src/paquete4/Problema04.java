/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int matrizA[][] = new int[3][2];
        int matrizB[][] = new int[3][2];
        String reporte = "";
        int mayores = 0;
        int menores = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Ingrese datos Matriz A [%d][%d]: ", i, j);
                matrizA[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Ingrese datos Matriz B [%d][%d]: ", i, j);
                matrizB[i][j] = entrada.nextInt();
            }
        }

        reporte = String.format("MATRIZ A\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte = String.format("%s%d\t", reporte, matrizA[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMATRIZ B\n", reporte);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte = String.format("%s%d\t", reporte, matrizB[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrizA[i][j] < matrizB[i][j]) {
                    menores = menores + 1;
                }
                if (matrizA[i][j] > matrizB[i][j]) {
                    mayores = mayores + 1;
                }
            }
        }

        reporte = String.format("%s\n--- RESULTADO ---\n", reporte);

        if (menores == 0 && mayores > 0) {
            reporte = String.format("%sLa matriz A es mayor que la matriz B\n",
                    reporte);
        } else {
            reporte = String.format("%sLa matriz A no es mayor que la matriz "
                    + "B\n", reporte);
        }

        System.out.printf("\n%s\n", reporte);
    }
}
