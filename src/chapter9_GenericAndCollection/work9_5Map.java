package chapter9_GenericAndCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class work9_5Map {
    public static void main(String[] args) {
        HashMap();
    }
    private static void HashMap() {
        HashMap<String, String> hmap = new HashMap();
        LinkedHashMap<String, String> lhmap = new LinkedHashMap<>();
        TreeMap<String, String> tmap = new TreeMap<>();
        System.out.println(" => HashMap (การจัดเรียงบางทีอาจจะไม่เรียงลำดับ) ");
        hmap.put("th", "Thailand");
        hmap.put("jp", "Japan");
        hmap.put("au", "Australis");
        System.out.println(hmap);
        lhmap.putAll(hmap);
        tmap.putAll(hmap);

        if (hmap.containsKey("au")) {
            hmap.remove("au");
        }
        for (String str: hmap.values()) {
            System.out.println(str);
        }
        System.out.println("\n => LinkedHashMap (จัดเรียงลำดับจามที่ใส่ไป)");
        System.out.println(lhmap);
        System.out.println("\n => TreeMap (จัดเรียงลำดับตามตัวอักษร)");
        System.out.println(tmap);

    }
}
