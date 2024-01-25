package examenud04;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class RecorridoRobot {
    public static void main(String[] args) {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };
        mostrarMapa(mapa);
        String instrucciones = new Scanner(System.in).nextLine();
        System.out.println(recorridoRobot(mapa, instrucciones));
    }
    public static void mostrarMapa (String[] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            System.out.println(mapa[i]);
        }
    }
    public static boolean recorridoRobot(String[] mapa, String instrucciones) {
        char[] instruccion = instrucciones.toCharArray();
        char[][] mapaBiDimensional = mapaBidimensional(mapa);
        if (esMapaValido(mapaBiDimensional)) {
            for (int i = 0; i < instruccion.length; i++) {
                if (instruccion[i] == 'A') {
                    if (i == 0) {       // Si la primera instruccion es avanzar, avanzará
                        // Avanza
                    } else {
                        if (instruccion[i-1] == 'R') {  // Si es la instruccion anterior es que se mueva a la derecha
                            for (int k = 0; k < mapaBiDimensional.length; i++)
                                for (int j = 0; j < mapaBiDimensional[0].length; j++)
                                    mapaBiDimensional[k][j] = mapa[k].charAt(j);
                        } else if (instruccion[i-1] == 'L') {   // Si es la instruccion anterior es que se mueva a la izquierda
                            // Se mueve a la izquierda
                        } else {
                            for (int j = 0; j >= i; j++) {
                                if (instruccion[i-j] == 'R') {  // Si es la instruccion anterior es que se mueva a la derecha
                                    // Se mueve a la derecha
                                } else if (instruccion[i-j] == 'L') {   // Si es la instruccion anterior es que se mueva a la izquierda
                                    // Se mueve a la izquierda
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    private static char[][] mapaBidimensional(String[] mapa) {
        char[][] mapaBidimensional = new char[mapa.length][mapa[0].toCharArray().length];
        for (int i = 0; i < mapaBidimensional.length; i++) {
            for (int j = 0; j < mapaBidimensional[0].length; j++) {
                mapaBidimensional[i][j] = mapa[i].charAt(j);
                System.out.print(mapaBidimensional[i][j]);
            }
            System.out.println();
        }
        return mapaBidimensional;
    }
    private static Boolean esMapaValido(char[][] t){
        int contadorCasillasSalida = 0;
        int contadorCasillasLlegada = 0;
        // Comprobamos que tenga unas dimensiones mínimas
        if (t == null && t.length <= 0 && t[0].length <= 0) {
            System.out.println("ERROR. El mapa especificado no es válido.");
            return false;
        }

        // Comprobamos que tenga casilla de salida y casilla de llegada
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] == 'A') {
                    contadorCasillasSalida++;
                } else if (t[i][j] == 'Z') {
                    contadorCasillasLlegada++;
                }
            }
        }
        if (contadorCasillasLlegada != 1 || contadorCasillasSalida != 1) {
            System.out.println("ERROR. No tiene una casilla de salida y una casilla de llegada.");
            return false;
        }

        return true;
    }
}