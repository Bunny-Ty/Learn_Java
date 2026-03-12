package org.example.session4;

public class WhileLoop {

    public static void main (String[] args){

        // Khai bao bien dem
        int i = 0;

        // Vong lap while
        // Chay khi dieu kien i < 5 con dung
        while (i < 5){

            // In gia tri cua i
            System.out.println(" Giá trị của i là: " + i);

            // Tang i lên 1
            // Neu khong co dong nay se bi vong lap vo han
            i++;
        }

        // Sau khi vong lap ket thuc, in ra thong bao
        System.out.println("Vòng lặp đã kết thúc");
    }
}
