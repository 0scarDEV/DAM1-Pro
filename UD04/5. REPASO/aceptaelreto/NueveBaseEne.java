package aceptaelreto;
import java.util.Scanner;

public class NueveBaseEne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        if (base < 2 || base > 36){
            throw new IllegalArgumentException("Base fuera del rango permitido.");
        }

        if (base > 10) {
            baseSuperiorAdiez();
        } else {
            baseInferiorAonce();
        }
    }
    private  static void solucion(int dividendo, int divisor, int resto, int cociente) {
        if (dividendo % divisor == resto && dividendo  / divisor == cociente) {
            System.out.println("POSIBLEMENTE CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    private  static void baseInferiorAonce() {
        Scanner sc = new Scanner(System.in);
        int dividendo = sc.nextInt();
        int divisor = sc.nextInt();
        int cociente = sc.nextInt();
        int resto = sc.nextInt();

        solucion(dividendo, divisor, cociente, resto);
    }
    private static void baseSuperiorAdiez() {
        Scanner sc = new Scanner(System.in);
        int dividendo = 0, divisor = 0, cociente = 0, resto = 0;

        String ordenes = sc.nextLine();
        String[] digitos = ordenes.split(" ");
        if (digitos.length != 4) {
            throw new IllegalArgumentException("Debes introducir 4 dígitos");
        }

        String dividend = digitos[0];
        String diviso = digitos[1];
        String cocient = digitos[2];
        String rest = digitos[3];

        try {
            dividendo = Integer.parseInt(dividend);
            divisor = Integer.parseInt(diviso);
            cociente = Integer.parseInt(cocient);
            resto = Integer.parseInt(rest);

            solucion(dividendo, divisor, cociente, resto);
        } catch (Exception e) {
            // Para cada letra, la localizamos en el abecedario y, le sumamos 10

            String abededario = "ABCDEFGHIJKLMNOPQRSTUVXYZ";

            char[] div = dividend.toCharArray();
            char[] dis = diviso.toCharArray();
            char[] coc = cocient.toCharArray();
            char[] res = rest.toCharArray();

            int pos = 0;
            for (int i = 0; i < abededario.length(); i++) {
                String str = "";
                for (int j = 0; j < div.length; j++) {
                    if (div[j] == abededario.charAt(i)) {
                        pos = i;
                        dividend = String.valueOf(pos + 10);
                    }
                    str += dividend;
                }
                dividendo = Integer.parseInt(str);
            }
            for (int i = 0; i < abededario.length(); i++) {
                String str = "";
                for (int j = 0; j < dis.length; j++) {
                    if (dis[j] == abededario.charAt(i)) {
                        pos = i;
                        diviso = String.valueOf(pos + 10);
                    }
                    str += diviso;
                }
                divisor = Integer.parseInt(str);
            }
            for (int i = 0; i < abededario.length(); i++) {
                String str = "";
                for (int j = 0; j < res.length; j++) {
                    while (coc[j] != abededario.charAt(i)) {
                        pos = i;
                        cocient = String.valueOf(pos + 10);
                    }
                    str += cocient;
                }
                cociente = Integer.parseInt(str);
            }
            solucion(dividendo, divisor, cociente, resto);
            for (int i = 0; i < abededario.length(); i++) {
                String str = "";
                for (int j = 0; j < res.length; j++) {
                    while (res[j] != abededario.charAt(i)) {
                        pos = i;
                        rest = String.valueOf(pos + 10);
                    }
                    str += rest;
                }
                resto = Integer.parseInt(str);
            }
            solucion(dividendo, divisor, cociente, resto);
        }
    }
}