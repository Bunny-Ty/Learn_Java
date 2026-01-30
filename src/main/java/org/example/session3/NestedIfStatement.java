package org.example.session3;

public class NestedIfStatement {

    // Ham main - diem bat dau cua chuong trinh java
    public static void main (String[] args){

        // Khai bao bien age và gán giá trị là 20
        int age = 20;

        // Khai bao bien hasLicense de kiem tra co bang lai hay khong
        boolean hasLicense = true;

        // Kiem tra dieu kien dau tien: neu tuoi >= 18
        if (age >= 18){

            // Neu da du tuoi, tiep tuc kiem tra co bang lai hay khong
            if (hasLicense){
                // In ra khi du tuoi va co bang lai
                System.out.println("Bạn được lái xe");
            } else {
                // Truong hop du tuoi nhung khong co bang lai
                System.out.println("Bạn chưa có bằng lái xe");
            }
        } else {

            // Truong hop tuoi < 18
            System.out.println("Bạn chưa đủ tuổi lái xe");
        }

        // Câu lệnh luôn chạy sau khi if lồng nhau kết thúc
        System.out.println("Chuương trình kết thúc");

    }
}
