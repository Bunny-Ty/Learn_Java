package org.example.session3;
// public class (phai trung ten file)
public class WhatIsTheDifferenceBetweenObjectAndClass {

        public static void main (String[] args) {

            // tao object thu nhat tu class car
            Car car1 = new Car();
            car1.color = "Red";
            car1.speed = 100;

            // tao object thu hai tu class car
            Car car2 = new Car();
            car2.color = "Blue";
            car2.speed = 150;

            // in thong tin object
            System.out.println("Car 1 color: " + car1.color);
            car1.run();

            System.out.println("Car 2 color: " + car2.color);
            car2.run();
        }
    }

    // Class mo ta su khac nhau giua Object va Class
    class Car {
        // thuoc tinh (variable)
        String color;
        int speed;

        // phuong thuc (method)
        void run(){
            System.out.println("The car is running at speed: " + speed + " km/h");
        }
    }

