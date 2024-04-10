import java.util.*;

public class Main<E, O> {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1000,"Paco");
        hash.put(900,"Diego");
        hash.put(800,"Lucas");
        hash.put(11000,"To");
        hash.put(5646,"ew");
        hash.put(6773,"we");
        hash.put(43245,"q");
        for (Integer indice : hash.keySet()){
            System.out.println(hash.get(indice));
        }
        Set<Map.Entry<Integer, String>> po = hash.entrySet();
        //System.out.println(po);
        Collections.singleton(3);
        System.out.println(ordenar(hash, (a, b) -> b - a));

    }

    public static <E, O> TreeMap<E, O> ordenar(HashMap<E, O> a, Comparator<E> c){
        /*Set<E> x = a.keySet();
        HashMap<E,O> clon = new LinkedHashMap<>();
        for (E in : x) {
            clon.put(in, a.get(in));
        }
        return clon;*/
        TreeMap<E, O> tree = new TreeMap<>(c);
        tree.putAll(a);
        return  tree;
    }
}