package ejerciciosapuntes;

import java.util.Arrays;

/* Óscar Fernández Pastoriza
E0611. Se dispone de los siguientes conjuntos de letras:
conjunto 1: e, i, k, m, p, q, r, s, t, u, v
conjunto 2: p, v, i, u, m, t, e, r, k, q, s

Con esta información es posible codificar un texto, convirtiendo cada letra del conjunto 1 en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre el resultado de la codificación en minúsculas.
    Un ejemplo: la palabra "PaquiTo" se codifica como "matqvko".

Realizar un programa que codifique un texto. Para ello implementar la siguiente función:
    char codifica(char conjunto1[],char conjunto2[], char c)
que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.

Implementa también el método para codificar una palabra o frase entera:
    public static String codifica(char[] conjunto1, char[] conjunto2, String palabra)
Crea un programa principal o tests unitarios para probar los métodos anteriores.*/
public class E0611 {
    public static void main(String[] args) {
        char[] conjunto1 = "eikmpqrstuv".toCharArray();
        char[] conjunto2 = "pviumterkqs".toCharArray();

        String palabra = "PaquiTo";
        char letraCodificada = codifica(conjunto1, conjunto2, 'T');
        String palabraCodificada = codifica(conjunto1, conjunto2, palabra);

        System.out.println(palabraCodificada);
    }

    public static char codifica(char conjunto1[],char conjunto2[], char c){
        char ch = ' ';
        int pos = String.valueOf(conjunto1).indexOf(Character.toLowerCase(c));

        if (pos == -1) {
            ch = c;
        } else {
            ch = conjunto2[pos];
        }

        return ch;
    }
    public static String codifica(char[] conjunto1, char[] conjunto2, String palabra){
        String res = "";

        for (int i = 0; i < palabra.length(); i++){
            res += codifica(conjunto1, conjunto2, palabra.charAt(i));
        }

        return res;
    }
}