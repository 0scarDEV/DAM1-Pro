package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas16. Crea una función que reemplace cada letra de una cadena de caracteres por la letra que le sigue en el alfabeto.  */
public class EjCadenas16 {
    public static void main(String[] args) {
        System.out.println(reemplazarAlfabetico("no se"));
    }
    public static String reemplazarAlfabetico(String frase){
        String fraseNueva = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' '){
                char[] chat = frase.toCharArray();
                chat[i]++;
                if(chat[i] =='{'){
                    chat[i] = '\u0061';
                }
                fraseNueva += chat[i];
            }else{
                fraseNueva += frase.charAt(i);
            }

        }
        return fraseNueva;
    }
}
