package org.example.session5;

import java.util.ArrayList;

public class TrimToSize {

    public static void main (String[] args){

        // Khoi tao ArrayList chua kieu String
        ArrayList<String> list = new ArrayList<>();

        // Lúc này dung luong mac dinh là 10 phàn tử
        // (Mac du size - so phan tu thuc te van dang la 0)

        // Chu dong tang dung luong len 20 phan tu
        list.ensureCapacity(20);

        // Bay gio 'list' co the chua 20 phan tu ma khong can mo rong them

        // Them 4 phan tu vao danh sach
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        // Tinh trang hien tai: Size (số phần tử thực tế) là 4, nhưng dung luong (capacity) vẫn là 20 --> Đang lãng phí 16 chỗ trống
        list.trimToSize();

        // Sau khi trimToSize(), dung luong se duoc dieu chinh xuong bang size hien tai (4)
        // Giúp chuong trinh tiết kiệm bộ nhớ khi không cần thiết phải giữ dung luong lớn hơn số phần tử thực tế

        System.out.println("Số phần tử hiện tại: " + list);
        System.out.println("Kích thước thực tế hiện tại:"+ list.size());
    }
}
