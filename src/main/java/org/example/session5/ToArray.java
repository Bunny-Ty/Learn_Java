package org.example.session5;

import java.util.ArrayList;

public class ToArray {

    public static void main (String[] args){

        // Tao 1 ArrayList chua cac chuoi
        ArrayList<String> list = new ArrayList<String>();

        // Them cac phan tu vao danh sach linh hoat
        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("STRUTS");

        // In danh sach ArrayList ban dau
        System.out.println("ArrayList ban dau: " + list);

        // Buoc chuyen doi
        // Su dung phuong thuc toArray() de lay 1 mang chua toan bo phan tu
        // Mac dinh toArray() tra ve mang kieu object (kieu du lieu to tien trong java)
        Object[] array = list.toArray();

        // In cac phan tu cua mang vua tao
        System.out.println("Các phần tử trong mảng sau khi chuyển đổi:");

        // Su dung vong lap for-each de duyet qua mang
        for (Object object: array){
            // In tung phan tu ra cac dong rieng biet
            System.out.println(object);
        }

    }
}
