package org.example.session3;

public class WhatIsAnObject {
        // Thuộc tính (property) của object
        // Biến name dùng để lưu tên của object
        String name = "Object";

        // Thuộc tính mô tả object là gì
        String description = "Object is a self-contained component with properties and methods.";

        // Phương thức của object
        // Dùng để hiển thị thông tin của object
        void showInfo() {

            // In giá trị của biến name ra màn hình
            System.out.println(name);

            // In giá trị của biến description ra màn hình
            System.out.println(description);
        }

        // Hàm main – nơi chương trình bắt đầu chạy
        public static void main(String[] args) {

            // Tạo một object tên là obj từ class WhatIsAnObject
            WhatIsAnObject obj = new WhatIsAnObject();

            // Gọi phương thức showInfo() của object obj
            obj.showInfo();
        }
}

