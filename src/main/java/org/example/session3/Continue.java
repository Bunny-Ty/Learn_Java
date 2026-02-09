package org.example.session3;

public class Continue {

    public static void main (String[] args){

        // Mang trang thai test case
        boolean[] testCases = {true, false, true, false, true}; // Vì mảng chỉ có 5 phần tử, index của mảng bắt đầu từ 0

        // true = test case active
        // false = test case inactive

        for (int i = 0; i < testCases.length; i++){

            // Neu test case bi disable
            if (!testCases[i]){
                continue;
                // Bo qua test case nay
                // Khong thuc hien test
            }

            // Chi chay test case active
            System.out.println("Running test case index:" + i);
        }
    }
}
