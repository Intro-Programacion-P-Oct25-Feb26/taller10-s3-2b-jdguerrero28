/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };

        String reporte = "";

        reporte = String.format("Estudiantes que inician con S, P o T:\n");

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {

                String inicial = estudiantes[i][j].substring(0, 1);

                if (inicial.equals("S") || inicial.equals("P")
                        || inicial.equals("T")) {
                    reporte = String.format("%s%s\n", reporte,
                            estudiantes[i][j]);
                }
            }
        }

        System.out.printf("%s\n", reporte);
    }
}
