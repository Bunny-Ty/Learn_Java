package org.example.session2; // Khai bao package chua class nay - File java nay phai nam dung thu muc

public class Session2TestPackage { // Khai bao 1 class public, co the duoc dung o noi khác - Connect trong class Testpkackage trong seesion 1
    public void printInfo(String text) { // method khong tra ve gia tri va nhan vao 1 chuoi String text
        System.out.println(text); // in noi dung chuoi text ra man hinh
    }

    public static void  main (String[] args ) {
        //tao doi tuong cua class
        Session2TestPackage session2 = new Session2TestPackage();

        // goi method
        session2.printInfo("Hello, Java Session 2!");
    }
}
