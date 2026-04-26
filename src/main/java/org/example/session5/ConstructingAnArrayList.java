package org.example.session5;

import java.util.ArrayList;

public class ConstructingAnArrayList {

    public static void main (String[] args){

        //Phuong phap 1: Constructor default
        // Tao 1 ArrayList chua cac so nguyen
        // Dung luong ban dau mac dinh se là 10
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5); // Them phan tu vao list
        list1.add(10);
        System.out.println("List 1" + list1);

        // Phuong phap 2: Chi dinh dung luong ban dau
        // Tao 1 ArrayList chua cac chuoi van ban (String)
        // So 20 nghia la ta yeu cau may tinh chuan bi san cho 20 phan tu ngay tu dau
        ArrayList<String> list2 = new ArrayList<>(20);
        list2.add("Java");
        list2.add("Python");
        System.out.println("List 2" + list2);

        // Phuong phap 3: Tao tu 1 collection khac
        // Tao 1 list3 va truyen list1 (da tao o tren) vao
        // list 3 se sao chep toan bo phan tu hien co cua list1
        ArrayList<Integer> list3 = new ArrayList<>(list1);
        list3.add(15); // Them phan tu moi vao list3 (khong anh huong den list1)
        System.out.println("List 3 (sao chep tu list 1" + list3);
    }
}
