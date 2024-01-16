package simud0401;
/* Óscar Fernández Pastoriza */
public class UtilMatrices {
    public static Boolean esMatrizValida(int[][] t){
        return t != null && t.length > 0 && t[0].length > 0;
    }
    public static Boolean esCuadrada(int[][] t){
        Boolean res = null;
        if (esMatrizValida(t)) {
            res = t.length == t[0].length;
        }
        return res;
    }
}