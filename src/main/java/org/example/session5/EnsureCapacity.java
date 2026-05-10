package org.example.session5;

import java.util.ArrayList;

public class EnsureCapacity {

    public static void main(String[] args){

        // Tao ArrayList chua kieu String
        ArrayList<String> list = new ArrayList<>();

        // In thong bao ban dau
        System.out.println("Tạo ArrayList mới.");

        // ensurecapacity(20)
        // Yêu cầu ArrayList chuẩn bị đủ bộ nhớ cho 20 phần từ
        // Điều này giúp tối ưu hiệu năng khi thêm nhiều dữ liệu
        list.ensureCapacity(20);

        // Thêm các phan tu vao danh sach
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        // In số lượng phần tự hiện tại
        System.out.println("Số phần tử hiện tại: " + list.size());

        // In toàn bộ danh sách
        System.out.println("Danh sách:");

        // Duyệt từng phần tử bằng vòng lặp for-each
        for (String item: list){

            // In phan tử hiện tại
            System.out.println(item);
        }
    }
}
