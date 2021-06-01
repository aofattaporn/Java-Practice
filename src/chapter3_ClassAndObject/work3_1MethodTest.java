package chapter3_ClassAndObject;
// ทุกๆ method ต้องอยู่ภายใน class ที่สร้างขึ้นมา
// method : คุณลักษณะความสามารถของ class นั้นๆ

import java.util.Scanner;

public class work3_1MethodTest {

    public static void main(String[] args) {
        System.out.println("========Test-Method=================");
        // methode ที่มีการส้งค่ากลับ
        System.out.println("power 2 of n : " +returnMethod(10));
        // method ที่ไมมีการส่งค่ากลับ "void"
        noReturn();



        // Test Overload method
        System.out.println("========Overload-Method==============");
        int x = 1, y = 2, z  = 3;
        System.out.println("Sum of 2 number : "+ testOverload(x, y));
        System.out.println("Sum of 3 number : "+ testOverload(x, y, z));
        System.out.println("Sum of 0 number : "+ testOverload("test"));
        System.out.println("=====================================");
    }

    // method ที่ไมมีการส่งค่ากลับ "void"
    public static void noReturn() {

        System.out.println("Test method noReturn : complete");
    }

    // method ที่มีการส่งค่ากลับ มีหรือไม่มี psrameter ก็ได้
    public static int returnMethod(int x) {
        x *= x;
        return x;
    }

    // parameter ของ method เป็น class ก็ได้
    public static void classParameter(Scanner sccan) {
    }

    // method overload : method ที่ชื่อเหมือนกันแต่แตกต่างกันที่ใช้คนละ parameter เพื่อความแตกต่างๆ
    public static int testOverload(int x, int y, int z){
        int sum = x + y + z;
        return  sum;
    }
    public static int testOverload(int x, int y){
        int sum = x + y;
        return  sum;
    }
    public static int testOverload(String str){
        return 0;
    }

}

