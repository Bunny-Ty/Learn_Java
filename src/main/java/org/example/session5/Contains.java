package org.example.session5;

import java.util.ArrayList;

public class Contains {

    public static void main (String[] args){

        // Khoi tao 1 ArrayList chua cac so thuc (kieu double)
        ArrayList<Double> list = new ArrayList<>();

        // Them cac phan tu vao danh sach
        list.add(1.1);
        list.add(11.11);
        list.add(111.111);
        list.add(1111.1111);

        // Vi du 1: Kiem tra so '111.111' (so nay khong co trong danh sach) --> ket qua se tra ve false
        boolean result1 = list.contains(111.1111);
        System.out.println("Danh sách có chứa số 111.1111 không? " + result1);

        // Vi du 2: Kiem tra so '11.11' (so nay co trong danh sach) --> ket qua se tra ve true
        boolean result2 = list.contains(11.11);
        System.out.println("Danh sách có chứa số 11.11 không? " + result2);

        // Ung dung thuc te voi cau lenh dieu kien if
        if (list.contains(1.1)){
            System.out.println("Tìm thấy số 1.1 trong danh sách!");
        } else {
            System.out.println("Không tìm thấy số 1.1");
        }

    }
}
