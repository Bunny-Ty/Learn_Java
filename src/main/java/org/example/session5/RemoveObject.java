package org.example.session5;

import java.util.ArrayList;

public class RemoveObject {

    public static void main (String[] args){

        // Tao 1 ArrayList chua cac chuoi van ban
        ArrayList<String> list = new ArrayList<String>();

        // Them du lieu vao danh sach
        list.add("AAA"); // Index 0
        list.add("BBB"); // Index 1
        list.add("AAA"); // Index 2
        list.add("CCC"); // Index 3
        list.add("BBB"); // Index 4

        // In danh sach ban dau: [AAA, BBB, AAA, CCC, BBB]
        System.out.println("Danh sách ban đầu: " + list);

        // Xoa lan xuat hien dau tien cua "AAA"
        // May tinh quet tu trai qua, thay "AAA" ngay vi tri dau tien va xoa no
        // Chu "AAA" o giua danh sach van ban con nguyen
        list.remove("AAA");
        System.out.println("Sau khi xóa 'AAA' lần đầu tiên: " + list);

        // Xoa lan xuan hien dau tien cua "BBB"
        // Luc nay chu "BBB" dau tien nam o vi tri dau danh sach moi
        // No se bi xoa va chu "BBB" o cuoi danh sach van nguyen
        list.remove("BBB");
        System.out.println("Sau khi xóa 'BBB' lần đầu tiên: " + list);

        // Vi du xoa 1 phan tu khong co trong danh sach
        list.remove("XXX");
        System.out.println("Thử xóa 'XXX' không tồn tại: " + list);

    }
}
