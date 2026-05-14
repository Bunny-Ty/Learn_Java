package org.example.session5;

import java.util.ArrayList;

public class IsEmpty {

    public static void main (String[] args){

        // Khoi tao 1 ArrayList de chua cac so thuc (kieu double)
        ArrayList<Double> list = new ArrayList<>();

        // Kiem tra luc danh sach con trong
        // Su dung isEmpty()
        // Vi list moi tao chua co gi, nen ket qua se tra ve true
        System.out.println("Danh sách có rỗng không? " + list.isEmpty());

        // Su dung phuoương thuc size
        // Ket qua se tra ve 0
        System.out.println("Kích thước hiện tại của danh sách: " + list.size());
        System.out.println("-----------------------------");

        // Them phan tu va kiem tra lai
        list.add(10.5);

        // Bay gio danh sach khong con trong nua, isEmpty se tra ve false
        System.out.println("Sau khi thêm phần tử, danh sách có trống không? " + list.isEmpty());

        // Luc nay size() se tra ve: 1
        System.out.println("Kích thước hiện tại của danh sách: " + list.size());

        // Cach dung thuc te trong cau lenh dieu kien if
        if (list.isEmpty()){
            System.out.println("Thông báo: Danh sách đang rỗng, vui lòng thêm dữ liệu");
        } else {
            System.out.println("Thông báo: Danh sách đã có dữ liệu, sẵn sàng xử lý.");
        }
    }
}
