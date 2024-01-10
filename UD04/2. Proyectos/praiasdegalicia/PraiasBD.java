package praiasdegalicia;

public class PraiasBD {
    public static void main(String[] args) {
        Praias[] praias;
        praias = leerPraiasBD();

        for (int i = 0; i < praias.length; i++){
            System.out.println(praias[i].getNome());
        }
    }
    private static Praias[] leerPraiasBD(){
        Praias[] p = null;

        return p;
    }
}