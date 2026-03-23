package org.example.session5;
import java.util.ArrayList;


public class ArrayListExample {

    public static void main (String[] args){

        // Tao ArrayList Kieu String
        ArrayList <String> list = new ArrayList<>();

        // Them phan tu vao danh sach
        list.add("Java");
        list.add("Python");
        list.add("Java"); // trung van duoc
        list.add(null); // null duoc chap nhan

        // In toan bo danh sach
        System.out.println("Danh sách: " + list);
        // Lay phan tu theo index
        System.out.println("Phần tử tại index 1: " + list.get(1));
        // So luong phan tu
        System.out.println("Size: " + list.size());
        // Duyệt danh sách bằng for-each
        System.out.println("\n Duyệt danh sách:");
        for (String item : list){
            System.out.println(item);
        }
        // Xoa phan tu
        list.remove("Java"); // xoa phan tu dau tien co gia tri "Java")

        System.out.println("\n Sau khi xoa: ");
        System.out.println(list);

        ArrayList <String> testcase = new ArrayList<>();
        testcase.add("Login test");
        testcase.add("Register Test");
        testcase.add("Search Test");

        for (String tc: testcase){
            System.out.println("Running test case: " + tc);
        }
    }
}
