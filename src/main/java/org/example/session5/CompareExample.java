package org.example.session5;

import java.util.ArrayList;

public class CompareExample {

    public static void main (String[] args){

        // Dung mang Array - Khoi tao mang String co 3 phan tu
        String[] array = new String[3];

        // Cap nhat/ Gan gia tri bang dau [index]
        array[0] = "Java";
        array[1] = "Python";
        array[2] = "C++";

        // Lay so luong phan tu bang .length
        System.out.println("Độ dài mảng: " + array.length);
        System.out.println("Phần tử mảng tại index 0: " + array[0]);

        System.out.println("----------------------------------");

        // Dung mang ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Cap nhat/ Them gia tri
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("PHP");

        System.out.println("Số phần tử ArrayList: " + list.size());
        System.out.println("Phần tử ArrayList tại index 0: " + list.get(0));

        // Xoa phan de dang
        list.remove(1); // Xoa phan tu o index 1 (Python)
        System.out.println("ArrayList sau khi xóa phần tử tại index 1: " + list);
    }
}
