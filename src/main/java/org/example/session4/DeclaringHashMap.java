package org.example.session4;

import java.util.HashMap; // Import class HashMap de su dung trong khai bao HashMap
import java.util.Map; // Import interface Map de su dung trong khai bao HashMap

public class DeclaringHashMap {

    public static void main (String[] args){

        // Khai bao HashMap voi : Key kieu String - Value kieu Integer
        Map<String, Integer> studentScores = new HashMap<>();

        // Them du lieu vao HashMap
        studentScores.put("An", 85); // Key = "An", Value = 85
        studentScores.put("Binh", 90); // Key = "Binh", Value = 90
        studentScores.put("Chi", 78); // Key = "Chi", Value = 78

        // Lay gia tri theo Key
        System.out.println("Điểm của An: " + studentScores.get("An")); // In ra "Điểm của An: 85"

        // Kiem tra co ton tai Key khong
        if (studentScores.containsKey("Chi")){
            System.out.println("Có sinh viên Chi trong danh sách");
        }

        // In toàn bộ HashMap
        System.out.println("Tất cả sinh viên và điểm số: " + studentScores);
    }
}
