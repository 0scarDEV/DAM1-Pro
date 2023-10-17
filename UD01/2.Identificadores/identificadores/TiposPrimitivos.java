package identificadores;
public class TiposPrimitivos {
    public static void main(String[] args) {
/* Declaramos las variables de Tipo Primitivo: */
        byte NumeroByte = 1;
        short NumeroShort = 32767;
        int NumeroInt = 2147483647;
        long NumeroLong = 1122334455121312312L;
        float NumeroFloat = 1.2F;
        double NumeroDouble = 8.90;
        char CaracterUnicode = '\u0041';
        boolean DatoLogico = false; 

/* Ahora imprimimos los datos en formato texto en una sola línea: */
        System.out.println("A continuación se muestran por pantalla lo solicitado:");
        System.out.println("NumeroByte es de tipo Byte, tiene el valor " + NumeroByte + " y ocupa 8 bits en memoria.");
        System.out.println("NumeroShort es de tipo Short, tiene el valor " + NumeroShort + " y ocupa 16 bits en memoria.");
        System.out.println("NumeroInt es de tipo Int, tiene el valor " + NumeroInt + " y ocupa 32 bits en memoria.");
        System.out.println("NumeroLong es de tipo Long, tiene el valor " + NumeroLong + " y ocupa 64 bits en memoria.");
        System.out.println("NumeroFloat es de tipo Float, tiene el valor " + NumeroFloat + " y ocupa 32 bits en memoria.");
        System.out.println("NumeroDouble es de tipo Double, tiene el valor " + NumeroDouble + " y ocupa 64 bits en memoria.");
        System.out.println("NumeroChar es de tipo Char, tiene el valor " + CaracterUnicode + " y ocupa 16 bits en memoria.");
        System.out.println("DatoLogico es de tipo Boolean, tiene el valor " + DatoLogico + " y ocupa 1 bits en memoria.");        

/* Ahora imprimimos los datos en formato tabla: */
        System.out.println(
                "Tipo"  +   '\t' + "NumBits" + "\t " + "Valor" + "\n" +
                "-------------------------------------------" + "\n" +
                "Byte"  +   '\t' + "      8" + "\t " + NumeroByte + "\n" +
                "Short" +   '\t' + "     16" + "\t " + NumeroShort + "\n" +
                "Int"   +   '\t' + "     32" + "\t " + NumeroInt + "\n" +
                "Long"  +   '\t' + "     64" + "\t " + NumeroLong + "\n" +
                "Float" +   '\t' + "     32" + "\t " + NumeroFloat + "\n" +
                "Double"+   '\t' + "     64" + "\t " + NumeroDouble + "\n" +
                "Char"  +   '\t' + "     16" + "\t " + CaracterUnicode + "\n" +
                "Boolean"+  '\t' + "      1" + "\t " + DatoLogico + '\n' +
                "-------------------------------------------"
        );
    }
}