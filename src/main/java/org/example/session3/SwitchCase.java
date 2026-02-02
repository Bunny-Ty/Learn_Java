package org.example.session3;

public class SwitchCase {

    public static void main (String[] args){ // Ham main - diem bat đau cua chuong trinh java

        // Khai bao bien day, dai dien cho ngay trong tuan
        int day = 3;

        // Su dung cau lenh Switch de kiem tra gia tri cua bien day
        switch (day){

            // Truong hop day = 2
            case 2:
                System.out.println("Today is Monday"); // In ra man hinh "Hom nay la thu 2"
                break; // Thoat khoi switch, khong kiem tra cac case tiep theo

            // Truong hop day = 3
            case 3:
                System.out.println("Today is Tuesday"); // In ra man hinh "Hom nay la thu 3"
                break; // Thoat khoi switch, khong kiem tra cac case tiep theo

            // Truong hop day = 4
            case 4:
                System.out.println("Today is Wednesday"); // In ra man hình "Hom nay la thu 4"
                break; // Thoat khoi switch, khong kiem tra cac case tiep theo

            // Truong hop khong khop bat ky case nao o tren
            default:
                System.out.println("Invalid day");
        }
        // Chuong trinh tiep tuc chay tu day sau khi swicth ket thuc
    }
}
