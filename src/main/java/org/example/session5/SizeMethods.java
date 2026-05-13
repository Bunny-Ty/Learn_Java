package org.example.session5;

import java.util.ArrayList;

public class SizeMethods {

    public static void main(String[] args){

        // Khoi tao 1 ArrayList de chua cac so thuc
        ArrayList<Double> list = new ArrayList<>();

        // Them cac phan tu vao danh sach bang phuong thuc add
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        list.add(4.4);
        list.add(5.5);

        // In toan bo danh sach ra man hinh
        // Ket qua se la: [1.1, 2.2, 3.3, 4.4, 5.5]
        System.out.println("Danh sach ban dau: " + list);

        // Su dung phuong thuc size de lay kich thuoc cua danh sach
        int soLuong = list.size();

        // In ket qua so luong phan tu ra man hinh
        // Vi da add 5 so vao, nen ket qua se tra ve la 5
        System.out.println("So luong phan tu trong danh sach: " + soLuong);

        // Thu nghiem them 1 phan tu nua de thay size thay doi
        list.add(6.6);
        System.out.println("Sau khi them 1 phan tu, size moi la: " + list.size());
    }
}
