/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int dias[] = new int[estudiantes.length];
        String reporte = "";

        for (int i = 0; i < asistencia.length; i++) {
            int contador = 0;

            for (int j = 0; j < 5; j++) {
                if (asistencia[i][j] == true) {
                    contador = contador + 1;
                }
            }
            dias[i] = contador;
        }
        reporte = String.format("REPORTE DE ASISTENCIA\n----------------------"
                + "----------");
        for (int i = 0; i < estudiantes.length; i++) {
            reporte = String.format("%s\nEstudiante: %s -- Dias asistidos: "
                    + "%d\n",
                    reporte,
                    estudiantes[i],
                    dias[i]
            );
            if (dias[i] == 5) {
                reporte = String.format("%s (ASISTENCIA COMPLETA)", reporte
                );
            } else {
                reporte = String.format("%s (ASISTENCIA INCOMPLETA)", reporte);

            }
        }
        System.out.printf("%s\n", reporte);
    }
}
