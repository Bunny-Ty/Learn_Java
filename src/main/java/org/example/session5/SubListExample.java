package org.example.session5;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {

    public static void main (String[] args){

        // Tao 1 ArrayList chua cac so nguyen (kieu Integer)
        ArrayList<Integer> list = new ArrayList<>();

        // Them cac phan tu vao danh sach
        list.add(111); // Index 0
        list.add(222); // Index 1
        list.add(333); // Index 2
        list.add(444); // Index 3
        list.add(555); // Index 4
        list.add(666); // Index 5

        // In danh sach ban dau de kiem tra
        System.out.println("Danh sách ban đầu: " + list);

        // Lay danh sach con (sublist)
        // Lay tu indxex 1 den trước index 4 (khong bao gom index 4 - tuc la index 1,2,3)
        List<Integer> subList = list.subList(1,4);
        System.out.println("Danh sach con (index 1 đến 3): " + subList);

        // Thay doi tren danh sach goc
        // Sua phan tu tai index 2 cua danh sach goc thanh so 0
        list.set(2,0);

        // Vi sublist chi la 1 goc nhin nen no cung thay doi theo
        // Ket qua subList bay gio se la: [222, 0, 444]
        System.out.println("subList thay đổi theo danh sách gốc: " + subList);

        // Thay doi tren sublist
        // Sua phan tu tai index 2 cua sublist thanh so 0 (chinh la so 444 trong danh sach goc)
        subList.set(2,0);

        // Danh sach goc cung thay doi theo sublist
        // Ket qua danh sach goc bay gio se la: [111, 222, 0, 0, 555, 666]
        System.out.println("Danh sách gốc thay đổi theo subList: " + list);
    }
}
