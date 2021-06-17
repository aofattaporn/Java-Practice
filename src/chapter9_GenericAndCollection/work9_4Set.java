package chapter9_GenericAndCollection;

import java.lang.reflect.Array;
import java.util.*;

public class work9_4Set {
    public static void main(String[] args) {
        HashSet();
        LinkedSet();
        TreeSet();
    }
    private static void HashSet(){
        System.out.println("=> HashSet");
        HashSet<String> hash = new HashSet<>();
        hash.add("London");
        hash.add("Paris");
        hash.add("washington");
        System.out.println(hash);
        List<String> list = Arrays.asList("Bankok", "London", "Tokyo");
        System.out.println(list);
        hash.addAll(list);
        System.out.println(hash);
        System.out.println("London เกิดซ้ำกัน จึงหายไป");
        System.out.println("=======================\n");
    }

    private static void LinkedSet() {
        System.out.println("=> LinkedSet");
        LinkedList<String> hash  = new LinkedList<>();
        hash.add("London");
        hash.add("Paris");
        hash.add("washington");
        System.out.println(hash);
        List<String> list = Arrays.asList( "London", "Bankok", "Tokyo");
        System.out.println(list);
        hash.addAll(list);
        System.out.println(hash);
//        System.out.println("London เกิดซ้ำกัน จึงหายไป");
        System.out.println("=======================\n");

    }

    private static void TreeSet() {
        System.out.println("=> TreeSet");
        TreeSet<String> tree = new TreeSet<>();
        tree.add("London");
        tree.add("Paris");
        tree.add("washington");
        System.out.println(tree);
        List<String> list = Arrays.asList( "London", "Bankok", "Tokyo");
        System.out.println(list);
        tree.addAll(list);
        System.out.println(tree);
        System.out.println("\" มีการจัดเรียงใหม่ตามตัวอักษร \"");
    }

}
