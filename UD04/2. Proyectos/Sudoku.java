import java.util.Scanner;
public class Sudoku {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int casosPrueba = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número de casos de prueba

            for (int caso = 0; caso < casosPrueba; caso++) {
                // Leer el sudoku
                char[][] sudoku = new char[9][9];
                for (int i = 0; i < 9; i++) {
                    sudoku[i] = scanner.nextLine().toCharArray();
                }

                // Verificar si el sudoku es válido
                boolean esValido = esSudokuValido(sudoku);

                // Imprimir resultado
                if (esValido) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }

                // Consumir la línea en blanco entre casos de prueba
                if (caso < casosPrueba - 1) {
                    scanner.nextLine();
                }
            }

            // Cerrar el scanner al finalizar
            scanner.close();
        }

        // Función para verificar si un sudoku es válido
        private static boolean esSudokuValido(char[][] sudoku) {
            // Contar el número de celdas rellenas
            int celdasRellenas = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (sudoku[i][j] != '-') {
                        celdasRellenas++;
                    }
                }
            }

            // Verificar si el sudoku tiene simetría rotacional y no supera las 32 celdas rellenas
            return celdasRellenas <= 32 && tieneSimetriaRotacional(sudoku);
        }

        // Función para verificar si un sudoku tiene simetría rotacional
        private static boolean tieneSimetriaRotacional(char[][] sudoku) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (sudoku[i][j] != sudoku[8 - i][8 - j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
