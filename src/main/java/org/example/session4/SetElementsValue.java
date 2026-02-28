package org.example.session4;

import java.util.HashMap;

public class SetElementsValue {

    public static void main (String[] args){

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);

        // Ghi de key Germany
        capitalCities.put("Germany", "BerlinNew");
        System.out.println(capitalCities);

        // In riêng giá trị
        System.out.println(capitalCities.get("Germany"));
    }
}
