package chapter3_ClassAndObject;

import java.util.Scanner;

public class work3_3getterSetter {
    public static void main(String[] args) {
        Student std = new Student();
        Scanner scanner = new Scanner(System.in);
        // ไม่สามารถกำหนดค่า ชื่อและนามสกุลได้โดยตรง
        System.out.println("How old are you : ");
        int agestd3 = scanner.nextInt();
        std.setNamestd3("Hello wordl");
        std.setAge(agestd3);

        System.out.println(std.getNamestd3());
        System.out.println(std.getAge());

        System.out.println(std.PII);


    }
}
class Student {
    // กำหนดค่า field
    private String name;
    private int age;
    public final double PII =3.14;
    public Student() {
    }


    public String getNamestd3() {
        return name;
    }

    public void setNamestd3(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 ) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }
}