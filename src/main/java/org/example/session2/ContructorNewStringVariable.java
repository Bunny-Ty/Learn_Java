package org.example.session2;

//Using the new keyword and a constructor - Su dung tu khoa new va ham tao (constructor)
public class ContructorNewStringVariable {  // khai bao package chua class ContructorNewStringVariable
    public void contructorNewStringVariable(){ // Khai bao 1 phuong thuc thong thuong ten la contructorNewStringVariabl. Khong phai contructor la vi: 1/ Khong dung ten class (class ten ContructorNewStringVariable, con method lai khac chu hoa/ thuong) - 2/ Co kieu tra ve void la contructor thi khong co kieu tra ve --> Nghia la day la 1 method binh thuong khong phai ham tao
        String greet = new String("Good Morning"); // tao 1 doi tuong String moi = tu khoa new --> Tao 1 object String moi tren heap, khong dung String pool
        System.out.println(greet);
    }

    public static void main (String[] args){ // phuong thuc main - diem bat dau thuc thi chuong trinh
        ContructorNewStringVariable obj = new ContructorNewStringVariable(); // tao 1 doi tuong ContructorNewStringVariable de goi phuong thuc contructorNewStringVariable
        obj.contructorNewStringVariable(); //doi tuong chua phuc thuc de truy cap thanh phan trong doi tuong goi method contructorNewStringVariable
    }
}
