package org.example.session3;

public class Break {

    public static void main (String[] args){

        // Khai bao mang so nguyen
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        // Vong lap for: bat dau tu index = 1, moi lan tang 2
        for (int i = 1; i < numbers.length; i = i + 2){

            // Neu i bang 5 thi dung vong lap
            if (i == 5 ){
                break; // Thoat khoi vong lap for
            }

            // In ra phan tu tai vị trí 1
            System.out.println("Gia tri tai index " + i + " la: " + numbers[i]);
        }
        // Dong nay chi chay sau khi vong lap ket thuc
        System.out.println("Da thoat khoi vong lap");
    }
}
