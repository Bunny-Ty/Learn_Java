package org.example.session4;

import java.util.HashMap;

public class AccessItemsInAnArrayHashMap {

    public static void main (String[] args) {

        // Tao 1 HashMap voi: Key = String (ten quoc gia) - Value = String (thu do)
        HashMap<String, String> capitalCities = new HashMap<>();

        // Them du lieu vao HashMap
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // In toan bo HashMap
        System.out.println("Danh sách thủ đô: " + capitalCities);

        // Lay gia tri theo Key
        String capital = capitalCities.get("England");

        // In ket qua
        System.out.println("Thủ đô của England là: " + capital);
    }
}
