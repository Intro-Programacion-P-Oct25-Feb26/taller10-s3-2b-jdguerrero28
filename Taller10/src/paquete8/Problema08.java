/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author UTPL
 */
public class Problema08 {

    public static void main(String[] args) {
        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double[][] dato3 = new double[2][3];
        String reporte = "";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (dato1[i][j] < dato2[i][j]) {
                    dato3[i][j] = dato1[i][j];
                } else {
                    dato3[i][j] = dato2[i][j];

                }

            }

        }
        reporte = String.format("MATRIZ FINAL:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                reporte = String.format("%s%.0f\t", reporte, dato3[i][j]);
            }
            reporte = String.format("%s\n",reporte);
        }
            System.out.printf("%s", reporte);        
    }
}
