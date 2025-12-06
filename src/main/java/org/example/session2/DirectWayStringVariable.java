package org.example.session2;

//direct way - Tao chuoi cach truc tiep
public class DirectWayStringVariable { // Khai bao lop cong khai ten DirectWayStringVariable - Lop la khoi chinh de chua phuong tien va du lieu trong java
   // phuong thuc in chuoi truc tiep
    public void directWayStringVariable(){  // khai bao 1 phuong thuc cong khai - khong tra ve ket qua. ten phuong thuc directWayStringVariable va khong co tham so
        String greet = "Good Morning"; // Khai bao bien kieu string ten great va gan gia tri "Good Morning" -> Day la cach tao chuoi truc tiep
        System.out.println(greet); // in gia tri bien greet ra console
    }

    // phuong thuc main de chay chuong trinh
    public static void main (String[] args) {
        // tao doi tuong cua lop
        DirectWayStringVariable obj = new DirectWayStringVariable();
        // goi phuong thuc in ra chuoi
        obj.directWayStringVariable();
    }

}
