package examenud02;
/* Óscar Fernández Pastoriza */
public class MinutosTranscurridos {
    /* 
     * Implementa una función que calcule los minutos transcurridos entre dos instantes de tiempo del mismo día, A y B, a partir del número de hora y minuto de cada instante.
     * Ten en cuenta que cualquiera de los dos instantes de tiempo puede ser el mayor o incluso que pueden ser iguales. En cualquiera de estos casos el valor devuelto por la función será positivo o cero. Se espera que las horas de entrada estén entre 0 y 23 y los minutos entre 0 y 59, pero deberás validarlos. Considera definir una nueva función para validar los datos de entrada y evitar repetir código. Si algún valor de entrada no es correcto la función devolverá -1.
     */
    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        int tiempoTranscurrido = -1, horasTranscurridas = -1, minutosTranscurridos = -1;
        boolean horasDentroDeRango = horaA >= 0 && horaA < 24 && horaB >= 0 && horaB < 24;
        boolean minutosDentroDeRango = minutoA >= 0 && minutoA < 60 && minutoB >= 0 && minutoB < 60;

        if (horasDentroDeRango && minutosDentroDeRango) {
            if (horaA == horaB) {
                tiempoTranscurrido = minutoB - minutoA;
            } else if (horaA > horaB) {
                horasTranscurridas = horaA - horaB;
                if (minutoA > minutoB) {
                    minutosTranscurridos = minutoA - minutoB;
                    tiempoTranscurrido = (horasTranscurridas * 60) - minutosTranscurridos;
                } else if (minutoB > minutoA) {
                    minutosTranscurridos = minutoA - minutoB;
                    tiempoTranscurrido = (horasTranscurridas * 60) + minutosTranscurridos;
                }
            } else if (horaA < horaB) {
                horasTranscurridas = horaB - horaA;
                if (minutoA > minutoB) {
                    minutosTranscurridos = minutoA - minutoB;
                    tiempoTranscurrido = (horasTranscurridas * 60) - minutosTranscurridos;
                } else if (minutoB > minutoA) {
                    minutosTranscurridos = minutoA - minutoB;
                    tiempoTranscurrido = (horasTranscurridas * 60) + minutosTranscurridos;
                }
            }
        }
        return tiempoTranscurrido;
    }
    /*
    public static void main(String[] args) {
        int horaA = 10, minutoA = 20, horaB = 11, minutoB = 10;
        System.out.println(minutosTranscurridos(horaA, minutoA, horaB, minutoB));
    } 
     */
}