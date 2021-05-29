package chapter3_ClassAndObject;
public class work3_3getterSetter {
    public static void main(String[] args) {
        Student std = new Student();


    }
}
class Student {
    // กำหนดค่า field
    private String name;
    private int age;
    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}