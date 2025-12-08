package org.example.session2; // Khai bao package chua lop Format - Giup to chuc ma nguon theo thu muc va tranh trung ten lop

public class Format { // Khai bao lop cong khai co ten Format
    public void stringFormat(){ // Khai bao phuong thuc (method) tra ve kieu void, ten la stringFormat - Phuong thuc nay khong nhan tham so va thuc hien hanh dong dinh dang chuoi
        String value = "Testing VN"; // Khai bao bien value kieu String va gan gia tri "Testing VN"
        String formatted = String.format("Welcome to %s!", value); // Su dung String.format de tao mot chuoi moi - %s la placeholder dai dien cho 1 chuoi - Ket qua sau khi format se la: "Welcome to Testing VN!" - Chuoi nay duoc luu vao bien formatted
        System.out.println(formatted);
    }

    public static void  main (String[] args){ // Phuong thuc main - diem bat dau thuc thi chuong trinh
        Format f = new Format(); // Tao mot doi tuong cua lop Format de truy cap phuong thuc stringFormat
        f.stringFormat(); // Goi phuong thuc stringFormat thong qua doi tuong f
    }
}
