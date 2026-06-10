package org.example.session5;

import java.util.ArrayList;

public class AddAllExample {

    public static void main (String[] args){

        // Tao va them du lieu cho list1
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(111); // Index 0
        list1.add(222); // Index 1
        list1.add(333); // Index 2
        list1.add(444); // Index 3
        System.out.println("Danh sách list 1 ban đầu: " + list1);

        // Tao va them du lieu cho list2
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(555); // Index 0
        list2.add(666); // Index 1
        list2.add(777); // Index 2
        list2.add(888); // Index 3
        System.out.println("Danh sách list 2 ban đầu: " + list2);

        // Kết hợp
        list1.addAll(2,list2);
        System.out.println("List 1 sau khi addAll(2,list2): " + list1);
    }
}
