package org.example.session2; //khai bao package của class. Class CompareString nằm trong package org.example.session2

public class CompareString { // khai bao 1 lop cong khai ten là CompareString
    public void compareString(){ // khai bao 1 phuong thuc khong tra ve gi (void) ten là compareString
        String s1 = new String("HELLO"); // Tao 1 doi tuong String moi trong heap voi noi dung "Hello" - Lưu ý: dù "Hello" ton tai trong string pool nhung dung new String se tao 1 object hoan toan moi
        String s2 = new String("HELLO"); // tuong tu, tao 1 object String khác trong heap cung co noi dung "Hello" --> s1 và s2 khac nhau ve dia chi nho du co cung noi dung
        System.out.println(s1 == s2); // Toan tu == so sanh dia chi o nho (reference) cua 2 doi tuong - Vi s1 va s2 la 2 object khac nhau --> ket qua: False
        System.out.println(s1.equals(s2)); // equals() cua String được override de so sanh noi dung chuoi - Vi noi dung cua s1 va s2 giong nhau --> ket qua: True
    }

    public static void main (String[] args) { // phuong thuc main - diem bat dau thuc thi chuong trinh
        CompareString cs = new CompareString(); // tao 1 doi tuong CompareString de goi phuong thuc compareString
        cs.compareString(); // goi phuong thuc compareString de thuc hien viec so sanh 2 chuoi
    }
}
