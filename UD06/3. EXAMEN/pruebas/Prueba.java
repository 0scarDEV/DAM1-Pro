package pruebas;

import java.util.*;

public class Prueba {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println(list.size());
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.get(0);
        System.out.println(list);

        Set<Integer> setInt = new HashSet<>();
        Set<Integer> hashInt = new TreeSet<>();

        setInt.add(1);
        setInt.add(2);
        setInt.add(1);

        hashInt.add(1);
        // hashInt.add(null); NO DEJA
        hashInt.add(2);
        hashInt.add(1);

        System.out.println(setInt);
        System.out.println(hashInt);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        System.out.println(hashMap.getOrDefault(5, 1831283));   // Devuelve el valor por defecto
        System.out.println(hashMap.get(5));                                     // Devuelve NULL

        hashMap.put(1, 10);
        hashMap.put(2, 10);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        hashMap.put(1, 5);
        System.out.println(hashMap.get(1));

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, null);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        // treeMap.put(null, 1); EXCEPCIÓN

        Comparator<Integer> comp = (a, b) -> a - b;
        Comparator<Integer> comp2 = (a, b) -> {return  a - b;};
        Comparator<Integer> comp3 = (a, b) -> a - b;
    }
}
