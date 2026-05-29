package org.example.session5;

import java.util.ArrayList;

public class AppendAndInsert {

    public static void main (String[] args){

        // Tao 1 ArrayList chua cac chuoi
        ArrayList<String> list = new ArrayList<String>();

        // Them vao 4 phan tu vao danh sach
        list.add("ONE"); // Index 0
        list.add("TWO"); // Index 1
        list.add("THREE"); // Index 2
        list.add("FOUR"); // Index 3

        // Ket qua ban dau
        System.out.println("Danh sách ban dau: " + list);

        // Chen AAA vao vi tri index 1
        list.add(1,"AAA");
        System.out.println("Danh sách sau khi chèn AAA vào index 1: " + list);

        // Chen BBB vao vi tri index 3 cua danh sach moi
        // Luu y: Sau khi chen AAA vao index 1, thi cac phan tu tu index 1 tro di se bi dich sang phai 1 vi tri
        list.add(3,"BBB");
        System.out.println("Kết quả sau cùng: " + list);

        // Giải thich vi tri cuoi cung
        // Index 0: ONE
        // Index 1: AAA (mới chèn vào)
        // Index 2: TWO (bị đẩy sang phải)
        // Index 3: BBB (mới chèn vào)
        // Index 4: THREE (bị đẩy sang phải)
        // Index 5: FOUR (bị đẩy sang phải)
    }
}
