package org.example.session5;

import java.util.ArrayList;

public class Set {

    public static void main (String[] args){

        // Tao 1 ArrayList chua cac so nguyen (kieu Integer)
        ArrayList<Integer> list = new ArrayList<>();

        // Them 4 phan tu ban dau vao danh sach
        // Vi tri: 0 , 1 , 2 , 3
        list.add(111); // Them 111
        list.add(222); // Them 222
        list.add(333); // Them 333
        list.add(444); // Them 444

        // In danh sach ban dau de kiem tra
        // Ket qua: [111, 222, 333, 444]
        System.out.println("Danh sách ban đầu: " + list);

        // Thuc hien thay the (replace)
        // Thay the phan tu tai vi tri index 1 (dang la 222) bang so 0
        list.set(1,0);

        // Thay the phan tu tai vi tri index 3 (dang la 444) bang so 0
        list.set(3,0);

        // In danh sach sau khi da thay the
        // Ket qua se la: [111, 0, 333, 0]
        // Luu y: Trong Java, 000 cung chinh la so 0
        System.out.println("Danh sách sau khi thay thế:" + list);

    }
}
