package org.example.session2;

public class SomeCompare { // Khai bao 1 class ten la SomeCompare - ten class trung voi ten file
    public void someCompare(){ // Khai bao 1 method ten someCompare - void nghia la khong gia tri
        // Compare integer - so sanh so nguyen
        System.out.println(100 == 100); // so sanh 2 so nguyen 100 va 100 - ket qua true --> In ra man hinh true
        // Compare char - so sanh ky tu
        System.out.println('a' == 'a'); // 'a' la kieu char - so sanh 2 ky tu nguyen giong nhau --> ket qua true
        // Compare char & float - so sanh ky tu va so thuc
        System.out.println('a' == 97.1f); // 'a' co gia tri ASCII la 97 - 97.1f la so thuc kieu 97.1 - Java tu chuyen 'a' là 97 - So sanh 97 - 97.1 --> Ket qua la false
        // Compare boolean - so sanh gia tri logic
        System.out.println(true == true); // So sanh 2 gia tri boolean giong nhau --> ket qua true
    }

    public static void main (String[] agrs){
        SomeCompare sc = new SomeCompare(); // Tao doi tuong sc cua lop SomeCompare
        sc.someCompare(); // Goi phuong thuc someCompare thong qua doi tuong sc
    }

}
