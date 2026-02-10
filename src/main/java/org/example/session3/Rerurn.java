package org.example.session3;

public class Rerurn {

    static void runTest(String testData){

        // Neu test data null thi dung test
        if (testData == null){
            System.out.println("Test data invalid - stop test");
            return; // thoat method runTest
        }
        // Chi chay khi test data hop le
        System.out.println("Running test with data: " + testData);
    }

    public static void main (String[] args){
        runTest(null);
        runTest("Valid Data");

        // Khai bao bien boolean
        boolean t = true;

        // In ra thong bao truoc khi return
        System.out.println("Before the return");

        // Kiem tra dieu kien
        if(t){
            return; // Thoat khoi method main - Tat ca code phia duoi se khong chay
        }
        // Dong nay khong bao gio duoc thuc thi
        System.out.println("Not run");
    }
}
