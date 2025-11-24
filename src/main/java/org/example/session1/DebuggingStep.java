package org.example.session1; //khai báo package (goi) mà file java này thuộc về - Giúp tổ chức code mà file java này thuộc về

public class DebuggingStep {
    public static void main(String[] args) {
        int x = add(3, 5);   // đặt breakpoint ở đây
        System.out.println(x);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
//F7 → đi vào hàm add()
//F8 → chạy từng dòng
//Shift + F8 → thoát ra khỏi hàm add()