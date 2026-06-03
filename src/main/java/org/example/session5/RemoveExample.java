package org.example.session5;

import java.util.ArrayList;

public class RemoveExample {

    public static void main (String[] args){

        // Tao 1 ArrayList chua cac chuoi
        ArrayList<String> list = new ArrayList<String>();

        // Them du lieu vao danh sach
        list.add("AAA"); // Index 0
        list.add("BBB"); // Index 1
        list.add("ccc"); // Index 2
        list.add("DDD"); // Index 3
        list.add("e"); // Index 4

        // In danh sach ban dau: [AAA, BBB, ccc, DDD, e]
        System.out.println("Danh sách ban đầu: " + list);

        // Thực hien xoa vi tri thu 2
        // Phan tu "ccc" nam o index 2 se bi xoa - Sau do "DDD" và "e" se bi dich sang trai 1 vi tri
        list.remove(2);
        System.out.println("Sau khi xóa vị trí thu 2: " + list);

        // Thuc hien xoa vi tri thu 3
        // Luu y: Luc nay theo danh sach moi,"e" nam o vi tri thu 3
        list.remove(3);
        System.out.println("Sau khi xóa vị trí thu 3: " + list);

    }
}
