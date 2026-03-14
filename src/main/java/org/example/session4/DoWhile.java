package org.example.session4;

public class DoWhile {

    public static void main (String[] args){

        // Khai bao bien dem
        int i = 0;

        // Vong lap do...while
        do {
            // In gia tri cua i
            System.out.println(" Giá trị của i là: " + i);
            // Tang i lên 1
            i++;
        } while (i < 5); // Dieu kien kiem tra sau khi thuc hien khoi lenh trong do
        // Sau khi vong lap ket thuc, in ra thong bao
        System.out.println("Vòng lặp do...while đã kết thúc");

     //   Retry test case that bai
        int retry = 0;

        do {
            System.out.println("Running test... Attempt:" + retry);
            retry++;
        } while (retry<3);
    }
}
