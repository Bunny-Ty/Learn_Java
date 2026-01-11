package org.example.session3;


// Khai bao class voi access modifier la default (mac dinh)
class AccessExample {

    // Bien private: chi dung duoc trong class nay
    private int privateVar = 10;

    // Bien default: dung duoc trong cùng package
    int defaultVar = 20;

    // Bien protected: dung duoc trong cung package hoac class con (subclass)
    protected int proctectedVar = 30;

    // Bien public: dung duoc o bat ky dau
    public int publicVar = 40;

    // Constructor public: co the tao doi tuong o moi noi
    public AccessExample() {
        System.out.println("Constructor public được gọi");
    }

    // Phuong thuc private: chi duoc goi trong class nay
    private void privateMethod() {
        System.out.println("Phương thức private");
    }

    // Phuong thuc default: duoc goi trong cung package
    void defaultMethod() {
        System.out.println("Phương thức default");
    }

    // Phuong thuc protected: duoc goi trong cung package hoac class con
    protected void protectedMethod() {
        System.out.println("Phương thức protected");
    }

    // Phuong thuc public: duoc goi o bat ky dau
    public void publicMethod() {
        System.out.println("Phương thức public");
    }

    // Phuong thuc public goi phuong thuc private
    public void accessPrivateMethod(){
        privateMethod();
    }
}

public class AcessModifiers {

    // Phuong thuc main - diem bat đau cua chuong
    public static void main(String[] agrs){

        // Tao doi tuong cua class AccessExample
        AccessExample obj = new AccessExample();

        // Goi bien default
        System.out.println(obj.defaultVar);

        // Goi bien protected
        System.out.println(obj.proctectedVar);

        // Goi bien public
        System.out.println(obj.publicVar);

        // Goi phuong thuc default
        obj.defaultMethod();

        // Goi phuong thuc protected
        obj.protectedMethod();

        // Goi phuong thuc public
        obj.publicMethod();

        // Goi phuong thuc public de truy cap phuong thuc private
        obj.accessPrivateMethod();
    }
}



