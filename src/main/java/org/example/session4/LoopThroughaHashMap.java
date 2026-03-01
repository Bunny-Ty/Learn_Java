package org.example.session4;

import java.util.HashMap;

public class LoopThroughaHashMap {

    public static void main (String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Loop: Chi lay key
        System.out.println("=== Loop Key ===");
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // Loop: Chi lay value
        System.out.println("=== Loop Value ===");
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        // Loop: Lay ca key va value
        System.out.println("=== Loop Key va Value ===");
        for (String key: capitalCities.keySet()){
            System.out.println("Key: " + key + " | Value: " + capitalCities.get(key));
        }
    }
}
