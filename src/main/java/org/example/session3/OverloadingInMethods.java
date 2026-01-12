package org.example.session3;

public class OverloadingInMethods {

    // Phuong thuc main - diem bat dau cua chuong
    public static void main(String[] args){

        // Tao doi tuong cua class OverloadingInMethods
        OverloadingInMethods obj = new OverloadingInMethods();

        // Goi phuong thuc add voi 2 so nguyen
        System.out.println(obj.add(10, 20));

        // Goi phuong thuc add voi 3 so nguyen
        System.out.println(obj.add(10, 20,30));

        // Goi phuong thuc add voi int va float
        System.out.println(obj.add(10, 20.5f));

        // Goi phương thuc add voi float va int
        System.out.println(obj.add(15.5f, 25));

    }

    // Nap chong phuong thuc add voi 2 tham so int
    int add (int a, int b){
        // Tra ve tong cua 2 so nguyen
        return a + b;
    }

    // Nap chong phuong thuc add voi 3 tham so int
    int add (int a, int b, int c){
        // Tra ve tong cua 3 so nguyen
        return a + b + c;
    }

    // Nap chong phuong thuc add voi tham so int va float
    float add (int a, float b){
        // Tra ve tong cua int va float
        return a + b;
    }

    // Nap chong phuong thuc add voi tham so float va int (doi thu tu)
    float add (float a, int b){
        // Tra ve tong cua float va int
        return a + b;
    }
}
