package org.example.session1;
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

//khai báo package (goi) mà file java này thuộc về - Giúp tổ chức code mà file java này thuộc về
//khai báo lop công khai ten DebuggingStep - Toàn bộ code còn lại nằm trong lop này

//phuong thuc main, diem bat dau cua chuong trinh java khi chay
// public: có thể duoc goi tu ben ngoai
// static: không cần tạo đoi tuong de chay
// void: không trả về giá trị
// String[] args: tham số đầu vào là một mảng các chuỗi/ tham số dòng lệnh

// Gọi hàm add(3, 5) với tham số a=3 và b=5.
// Kết quả được gán vào biến x.
// In giá trị của biến x ra màn hình.


//Định nghĩa phương thức add, kiểu trả về int.
//static: có thể gọi trực tiếp trong main() mà không cần tạo đối tượng
//Nhận 2 tham số nguyên a và b
// Trả về tổng của hai tham số.