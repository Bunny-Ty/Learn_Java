package org.example.session5;

import java.util.ArrayList;

public class Get {

    public static void main (String[] args){

        // Tao 1 ArrayList chua cac so nguye (kiểu Integer)
        ArrayList<Integer> list = new ArrayList<>();

        // Them cac phan tu vao danh sach (phuong thuc add)
        list.add(111); // Them vao vi tri index 0
        list.add(222); // Them vao vi tri index 1
        list.add(333); // Them vao vi tri index 2
        list.add(444); // Them vao vi tri index 3

        // In toan bo danh sach de quan sat thu tu
        System.out.println("Danh sách ban đầu: " + list);

        // Su dung phuong thuc get()

        // Lay phan tu o vi tri index 3
        // May tinh tim den o so 3 va thay gia tri la 444
        Integer elementAt3 = list.get(3);
        System.out.println("Phần tử tại index 3 là: " + elementAt3);

        // Lay phan tu o vi tri index 1
        // May tinh tim den o so 1 va thay gia tri la 222
        Integer elementAt1 = list.get(1);
        System.out.println("Phần tử tại index 1 là: " + elementAt1);

        // Lay phan tu o vi tri index 0
        System.out.println("Phần tử tại index 0 là: " + list.get(0));

        // Truong hop ngoai le: Lay phan tu o vi tri index 5 (khong ton tai)
        // May tinh tim den o so 5 nhung khong co, nen se phat sinh ngoai le IndexOutOfBoundsException
        try {
            Integer elementAt5 = list.get(5);
            System.out.println("Phần tử tại index 5 là: " + elementAt5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lỗi: Không thể lấy phần tử tại index 5 vì nó vượt quá kích thước của danh sách.");
        }
    }
}
