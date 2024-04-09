package coleccionesejercicios.EP1219;
import java.util.*;
/* �scar Fern�ndez Pastoriza */
public class AppFrase {
    /* EP1219. Escribe un programa donde se introduzca por consola una frase que conste exclusivamente de palabras separadas por espacios. Las palabras de la frase se almacenar�n en una lista. Finalmente, se mostrar�n por pantalla las palabras que est�n repetidas y, a continuaci�n, las que no lo est�n. */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String entrada = sc.nextLine();
            String[] aux = entrada.split(" ");
            Set<String> repetidos = new TreeSet<>();
            Set<String> noRepetidos = new TreeSet<>();
            boolean flag;

            List<String> strings = new ArrayList<>(Arrays.asList(aux));

            for (int i = 0; i < strings.size(); i++){
                flag = false;
                for (int j = 0; j < strings.size(); j++){
                    if (i != j){
                        if(strings.get(i).equals(strings.get(j))){
                            repetidos.add(strings.get(i));
                            flag = true;
                        }
                    }
                }
                if (!flag) {
                    noRepetidos.add(strings.get(i));
                }
            }
            System.out.println(repetidos);
            System.out.println(noRepetidos);
        }
    }