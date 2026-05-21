package org.example.session5;

import java.util.ArrayList;

public class InDexOf {

    public static void main (String[] args){

        // Khoi tao ArrayList chua cac chuoi (String)
        ArrayList<String> list = new ArrayList<>();

        // Them du lieu vao danh sach
        // Vi tri: 0 , 1 , 2 , 4 , 5 , 6

        list.add("JAVA"); // Index 0
        list.add("J2EE"); // Index 1
        list.add("JSP");  // Index 2
        list.add("JAVA"); // Index 3 - Java xuất hiện lần 2
        list.add("SERVLETS"); // Index 4
        list.add("JAVA"); // Index 5 - Java xuất hiện lần 3
        list.add("STRUTS"); // Index 6

        // In toan bo danh sach ra de xem
        System.out.println("Danh sách:" + list);

        // Su dung indexOf()
        // Tim vi tri dau tien cua chu "Java"
        // Ket qua se la 0 vi no gap chu "Java" ngay tai vi tri dau tien
        int firstIndex = list.indexOf("JAVA");
        System.out.println("Vị trí đầu tiên của Java là: " + firstIndex);

        // Su dung lastIndexOf()
        // Tim vi tri cuoi cung cua chu "Java"
        // Ket qua se la 5 vi no gap chu "Java" lan cuoi cung tai vi tri 5
        int lastIndex = list.lastIndexOf("JAVA");
        System.out.println("Vị trí cuối cùng của Java là: " + lastIndex);

        // Truong hop khong tim thay
        // Tim 1 chu khong co trong danh sách vi du "Python"
        // Ket qua se tra ve -1 vi no khong tim thay chu "Python" trong danh sach
        int notFound = list.indexOf("Python");
        System.out.println("Vị trí của Python là: " + notFound);
    }
}
