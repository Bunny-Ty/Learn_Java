package org.example.session5;

import java.util.ArrayList;

public class CapacityAnArrayList {

    public static void main (String[] args){

        // Khoi tao 1 ArrayList chua cac chuoi (String)
        // Luc nay, dung luong mac dinh ban dau la 10
        ArrayList<String> list = new ArrayList<>();

        // Su dung phuong thuc ensureCapacity() de tang dung luong len 20 1 cach thu cong
        // Viec nay giup ArrayList chuan bi san bo nho cho 20 phan tu ma khong can
        // phai tu dong co gian nhieu lan khi them du lieu
        list.ensureCapacity(20);

        // Bay gio 'list' da dam bao co du cho de chua it nhat 20 phan tu
        list.add("Phần tử 1");
        list.add("Phần tử 2");

        System.out.println("Danh sách hiện tại: " + list);
        System.out.println("ArrayList đã được chuẩn bị dung lượng sẵn sàng! ");
    }
}
