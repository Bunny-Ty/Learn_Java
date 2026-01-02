package org.example.session3;

public class WhatIsClass {

    // field (thuoc tinh)
    String message = "A class is a blueprint for creating objects.";

    // method (phuong thuc)
    void showMessage(){
        System.out.println(message);
    }

    // method main de chuong trinh co the chay
    public static void main(String[] args){
        WhatIsClass example = new WhatIsClass(); // tao object tu class
        example.showMessage(); // goi phuong thuc
    }
}
