package org.example.session1;

import org.example.session1.com.testing.vn.common.Helper; //Import lớp Helper từ package org.example.session1.com.testing.vn.common.

public class HowToImportPackage { //Khai báo một lớp public có tên HowToImportPackage.

    public static void main(String[] args) {
        double value = 99.5; //Khoi tao mot bien kieu double ten la value va gan gia tri 99.5
        String formatValue = Helper.getFormatDollar(value); // Goi phuong thuc tinh getFormatDollar từ class Helper - truyen vào gia tri value va nhan ket qua dang chuoi string
        // Bien formatValue se chua chuoi da dinh dang ví dụ: "$99.50" (tùy logic trong Helper).
        System.out.println("Format value: " + formatValue);
    }
}
