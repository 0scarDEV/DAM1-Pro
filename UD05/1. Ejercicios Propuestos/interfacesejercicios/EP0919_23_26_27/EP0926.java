package interfacesejercicios.EP0919_23_26_27;
import interfacesejercicios.EP0916_17_18_24_25.Lista;
public class EP0926 {
    /* EP0926. Repetir Actividad de aplicación EP0925 con elementos de tipo Socio cuyo orden natural es el de la edad. */
    public static void main(String[] args) {
        Lista l2 = new Lista();

        Socio s1 = new Socio();
        Socio s2 = new Socio();
        Socio s3 = new Socio();
        Socio s4 = new Socio();

        l2.addInicio(s4);
        l2.addInicio(s1);
        l2.addInicio(s3);
        l2.addInicio(s2);

        l2.ordenar();
    }
}
