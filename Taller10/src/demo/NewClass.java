/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Locale;
import java.util.Scanner;
//r
/**
 *
 * @author reroes
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] ventas = new double[2][5];
        String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int fila;
        int columna;
        double suma = 0;

        for (fila = 0; fila < ventas.length; fila++) {
            for (columna = 0; columna < ventas[fila].length; columna++) {
                System.out.println(vendedores[fila] + " ingrese las ventas del "
                        + "dia: " + dia[columna]);
                ventas[fila][columna] = entrada.nextDouble();

                suma = suma + ventas[fila][columna];
            }
        }
        for (fila = 0; fila < ventas.length; fila++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[fila]);
        }
        System.out.printf("Han realizado un total de $%.2f en ventas\n", suma);

    }
}
