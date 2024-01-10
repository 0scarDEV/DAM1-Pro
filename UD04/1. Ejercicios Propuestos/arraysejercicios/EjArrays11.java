package arraysejercicios;
import java.util.Scanner;

/*
 * EjArrays11. Escribe un programa en Java que implemente un juego de tres en raya. El programa debe permitir a dos jugadores jugar al juego turnándose para colocar fichas en un tablero de 3x3. El juego termina cuando un jugador consigue tres fichas en línea (horizontal, vertical o diagonal)
  * Sugerencias:
  * - Tablero como una matriz 3x3 char, 3 símbolos distintos.
  * - 2 jugadores 
  * - iniciarTablero()
  * - mostrarTablero()
  * - leerMovimiento()
  * - boolean comprobarVictoria()
 */
public class EjArrays11 {
    char[][] tablero = new char[3][3];
    int jugada;

    public void iniciarTablero(){
        for(int i = 0 ; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = '-';
            }
        }
    }

    public void mostrarTablero(){
        for(int i = 0 ; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void leerMovimiento(){
        int col, row;
        
        System.out.print("Introduce la fila en la que desea introducir su movimiento: ");
        col = new Scanner(System.in).nextInt();
        System.out.print("Introduce la columna en la que desea introducir su movimiento: ");
        row = new Scanner(System.in).nextInt();

        if (jugada % 2 == 0){
            tablero[col][row] = 'X';
        } else {
            tablero[col][row] = 'O';
        }
    }
    
    public boolean comprobarVictoria(){
        if ((tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) || 
            (tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[1][2]) || // Diagonales
            (tablero[1][0] == tablero[1][0] && tablero[1][0] == tablero[2][0]) ||
            (tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2]) || // Vertical && Horizontal
            (tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2]) ||
            (tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2]) || // Arriba y abajo
            (tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0]) || 
            (tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2])){  // Izquierda y derecha
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        EjArrays11 partida1 = new EjArrays11();
        partida1.iniciarTablero();
        partida1.mostrarTablero();
        for (int i = 0; i < 9; i++) {
            partida1.leerMovimiento();
            partida1.jugada++;
            System.out.println("Tablero resultante: ");
            partida1.mostrarTablero();
        }
        System.out.println("¿Alguien ganó? " + partida1.comprobarVictoria());
    }
}
