package org.example.session2;

public class Printf {
    public void printfEx(){
        System.out.printf("testingvn%nline%nterminator");
        // System.out.println("'%s' %n", "testingvn");  - Không có phương thức: println(String, String), Java báo lỗi vì không tồn tại hàm println với 2 tham số.
        // Trong Java, System.out.println() chỉ có các dạng sau:
            // println() – không có tham số
            // println(String) – 1 tham số chuỗi
            // println(int)
            // println(double)
        System.out.printf("'%s' %n", "testingvn");
        System.out.printf("'%S' %n", "testingvn");
    }
}

// Neu de in 2 chuoi cung luc:
// 1. Noi chuoi bang dau + : System.out.println("Hello " + "World");
// 2. Noi bang concat() : System.out.println("Hello ".concat("World"));
// 3. Dung printf(): System.out.printf("%s %s", "Hello", "World");
// 4. Dung format(): System.out.format("%s %s", "Hello", "World");
// 5. Gọi 2 lần println(): System.out.println("Hello"); System.out.println("World");