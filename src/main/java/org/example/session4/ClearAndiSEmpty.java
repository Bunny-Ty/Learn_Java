package org.example.session4;

import java.util.HashMap;

public class ClearAndiSEmpty {

    public static void main (String[] args){

        // Tao HashMap
        HashMap<String, String> users = new HashMap<>();

        // Them du lieu user
        users.put("user1", "Admin");
        users.put("user2", "Tester");

        // In du lieu ban dau
        System.out.println("Users:" + users);

        // Xóa toan bo du lieu
        users.clear();

        // Kiem tra HashMap co rong khong
        if (users.isEmpty()){
            System.out.println("HashMap is empty now.");
        } else {
            System.out.println("HashMap still has data.");
        }
    }
}
