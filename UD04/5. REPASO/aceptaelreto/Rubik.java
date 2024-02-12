package aceptaelreto;
import java.util.Scanner;

public class Rubik {
    public static void main(String[] args) {
        char[][] cubo = crearLado();
        cubo = rellenarLado(cubo);
        cubo = listaOperaciones(cubo);
        mostrar(cubo);
    }
    private static void mostrar(char[][] cubo) {
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo.length; j++) {
                System.out.print(cubo[i][j]);
            }
            System.out.println();
        }
    }
    private static char[][] listaOperaciones(char[][] cubo) {
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        char instruccion = letra.nextLine().charAt(0);

        while (instruccion != 'x') {
            int operacion = num.nextInt();
            if (Math.abs(operacion) < 1 || Math.abs(operacion) > cubo.length) {
                throw new IllegalArgumentException("Operacion inválida.");
            }

            if (instruccion == 'f')  {
                cubo = procesarInstruccionFila(cubo, operacion);
            } else if (instruccion == 'c') {
                cubo = procesarInstruccionColumna(cubo, operacion);
            } else {
                throw new IllegalArgumentException("Instruccion introducida no válida.");
            }

            instruccion = letra.nextLine().charAt(0);
        }

        return cubo;
    }
    private static char[][] procesarInstruccionFila (char[][] cubo, int operacion) {
        if (operacion > 0) {
            char ultValor = cubo[operacion - 1][cubo.length - 1];
            for (int i = cubo.length - 1; i >= 1; i--) {
                cubo[operacion - 1][i] = cubo[operacion - 1][i - 1];
            }
            cubo[operacion - 1][0] = ultValor;
        } else {
            operacion = Math.abs(operacion);
            char primValor = cubo[operacion - 1][0];
            for (int i = 0; i < cubo.length - 1; i++) {
                cubo[operacion - 1][i] = cubo[operacion - 1][i + 1];
            }
            cubo[operacion - 1][cubo.length - 1] = primValor;
        }
        return cubo;
    }
    private static char[][] rellenarLado(char[][] cubo) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cubo.length; i++) {
            String linea = sc.nextLine();
            if (linea.length() != cubo.length) {
                throw new IllegalArgumentException("Cada línea debe tener la misma longitud que las dimensiones del lado del cubo de Rubik");
            }

            for (int j = 0; j < cubo.length; j++) {
                cubo[i][j] = linea.charAt(j);
            }
        }
        return cubo;
    }
    private static char[][] crearLado() {
        Scanner sc = new Scanner(System.in);
        int dimensiones = sc.nextInt();
        if (dimensiones < 1 || dimensiones > 50) {
            throw new IllegalArgumentException("Número inválido, el número debe estar entre 1 y 50.");
        }
        return new char[dimensiones][dimensiones];
    }
    private static char[][] procesarInstruccionColumna (char[][] cubo, int operacion) {
        if (operacion > 0) {
            operacion = operacion - 1;
            char ultValor = cubo[cubo.length - 1][operacion];
            for (int i = cubo.length - 1; i > 0; i--) {
                cubo[i][operacion] = cubo[i - 1][operacion];
            }
            cubo[0][operacion] = ultValor;
        } else {
            operacion = Math.abs(operacion) - 1;
            char primValor = cubo[0][operacion];
            for (int i = 0; i < cubo.length - 1; i++) {
                cubo[i][operacion] = cubo[i + 1][operacion];
            }
            cubo[cubo.length - 1][operacion] = primValor;
        }
        return cubo;
    }
}