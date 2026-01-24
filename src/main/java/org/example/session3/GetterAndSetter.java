package org.example.session3;

class Person { // Class Person de minh hoa getter va setter
    // Bien private (khong cho truy cap truc tiep)
    private String name; // Bien private (khong cho truy cap truc tiep)
    private int age; // Bien private (khong cho truy cap truc tiep)

    // Getter cho name
    public String getName(){ // Getter cho name
        return name;
    }

    // Setter cho name
    public void setName(String name){ // Setter cho name
        this.name = name;
    }

    // Getter cho age
    public int getAge(){ // Getter cho age
        return age;
    }

    // Setter cho age (kiem soat gia tri)
    public void setAge(int age){ // Setter cho age
        if (age >= 0 && age <= 120){ // Kiem tra gia tri hop le
            this.age = age; // Gan gia tri neu hop le
        } else {
            System.out.println("Tuổi không hợp lệ! "); // In ra thong bao neu gia tri khong hop le
        }
    }
}

public class GetterAndSetter {

    public static void main (String[] args){ // Phuong thuc main - diem bat dau cua chuong
        Person p = new Person(); // Tao doi tuong Person

        // Gan gia tri bang setter
        p.setName("Nguyen Van A"); // Gan ten
        p.setAge(25); // Hop le

        // Lay gia tri bang getter
        System.out.println("Ten :" + p.getName()); // Se in ra Nguyen Van A
        System.out.println("Tuoi :" + p.getAge()); // Se in ra 25

        // Thu gan gia tri khong hop le
        p.setAge(-5); // Se in ra "Tuổi không hợp lệ!"
    }
}
