package org.example.session4;

import java.util.HashMap;
import java.util.Map;

public class CreateaHashMap {

    public static void main (String[] args){

        // ===========================
        // CACH 1: DUNG new HashMap() + put()
        // ===========================
        // Tao HashMap rong (co the them/ sua / xoa)
        Map<Integer, String> map1 = new HashMap<>();
        // Them du lieu vao map1
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        // In map1
        System.out.println("Map1 (HashMap + put): " + map1);
        // Thu them du lieu tiep
        map1.put(4, "D");
        System.out.println("Map1 sau khi them key 4: " + map1);



        // ===========================
        // CACH 2: DUNG Map.of() [Java 9+]
        // =============================
        // Tao HashMap khong thay doi (immutable)
        Map<Integer, String> map2 = Map.of(
                1, "A",
                2, "B",
                3, "C"
        );
        // In map2
        System.out.println("Map2 (Map.of): " + map2);
        // Thu them du lieu vao map 2 (SE BI LOI NEU BO COMMENT)
        // map2.put(4, "D"); // Loi: UnsupportedOperationException - khong the thay doi map2
    }
}
