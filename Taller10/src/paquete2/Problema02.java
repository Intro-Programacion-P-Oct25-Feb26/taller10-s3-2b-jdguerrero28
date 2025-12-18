/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        int[] familia = new int[3];
        int menoresEdad;
        int mayoresEdad;
        String resultado = "";

        for (int i = 0; i < familia.length; i++) {
            menoresEdad = 0;
            mayoresEdad = 0;

            for (int j = 0; j < 4; j++) {

                if (edades[i][j] >= 18) {
                    mayoresEdad = mayoresEdad + 1;

                } else {
                    menoresEdad = menoresEdad + 1;
                }

            }
            resultado = String.format("%sFamilia %s -- mayores de edad: %s\n",
                    resultado,
                    i + 1,
                    mayoresEdad);
        }
        System.out.printf("%s\n", resultado);
    }
}
