package org.example.session5;

import java.util.ArrayList;

public class ClearExample {

    public static void main (String[] args){

        // Tao 1 ArrayList moi de chua cac chuoi van ban
        ArrayList<String> list = new ArrayList<>();

        // Them 1 vai phan tu vao danh sach de lam mau
        list.add("AAA"); // Index 0
        list.add("BBB"); // Index 1
        list.add("AAA"); // Index 2
        list.add("CCC"); // Index 3
        list.add("BBB"); // Index 4

        // In danh sach hien tai ra man hinh
        // Ket qua se la: [AAA, BBB, AAA, CCC, BBB]
        System.out.println("Danh sách trước khi clear: " + list);
        System.out.println("Kích thước hiện tại: " + list.size());

        // Thuc hien xoa tat cac
        // Su dung phuong thuc clear() de don dep sach se danh sach
        list.clear();

        // In lai danh sach sau khi da clear
        // Ket qua se chi la 1 cap ngoac vuong trong []
        System.out.println("Danh sách sau khi clear: " + list);

        // Kiem tra xem danh sach co thuc su trong khong
        System.out.println("Danh sách có rỗng không? " + list.isEmpty());
        System.out.println("Kích thước sau khi clear: " + list.size());
    }
}
