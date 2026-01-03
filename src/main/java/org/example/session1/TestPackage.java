package org.example.session1;

public class TestPackage {

    public static void checkImportPackage() { // public: co the goi tu bat ky dau - static: co the goi ma khong can tao doi tuong cua lop TestPackage

        TestPackage testPackage = new TestPackage(); // khoi tao mot instance (doi tuong) cua lop TestPackage - Luc nay JVM cap phat vung nho cho doi tuong
        testPackage.printInfo("Debug text"); // goi phuong thuc private printInfo cua doi tuong vua tao. Truyen vao chuoi "Debug text" lam tham so. Do printInfo() hien khong co code nen no khong lam gi ca
        System.out.println("test 2");
    }

    // method private co noi dung de thay ket qua
    private void printInfo(String debugText) {
        System.out.println("Debug message: " + debugText);
    }

    // entry point cua chuong trinh
    public static void main(String[] args) {
        checkImportPackage(); // goi phuong thuc static checkImportPackage() de thuc thi cac lenh ben trong no
    }
}
