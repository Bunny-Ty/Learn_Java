package org.example.session4;

import java.util.HashMap;

public class HashMapSize {

    public static void main (String[] args){

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");

        System.out.println(capitalCities.size());
    }
}
