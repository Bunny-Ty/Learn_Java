package org.example.session3;

public class IfElseIfLadder {

    public static void main (String[] args){

        int time = 15; // thay doi gia tri de test

        if (time < 10){
            // Neu gio nho hon 10
            System.out.println("Good morning.");
        } else if (time < 20){
            // Neu gio tu 10 den duoi 20
            System.out.println("Good day.");
        } else {
            // Neu gio tu 20 tro len
            System.out.println("Good evening.");
        }
        System.out.println("Chuong trinh ket thuc");
    }
}
