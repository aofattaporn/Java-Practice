package chapter8_InterfaceAndLamda;

import java.awt.*;

interface Robotic {
    // static final
    public static final double weigth = 10.5;

    // abstract method
    public void move();

    // static method
    public static void echo(String str) {
        System.out.println(str);
    }

    // default method
    public default void walk() {
        echo("Robotic.walk();");
    }

    // default method
    public default void run() {
        echo("Robotic.run();");
    }
}

public class work8_2InterfaceJava8 implements Robotic{
    // override abstract method move ->  เรียกใช้ default method
    @Override
    public void move() {
        walk();
        run();
    }

    public static void main(String[] args) {
        work8_2InterfaceJava8 rb = new work8_2InterfaceJava8();
        rb.move();
//        rb.run();
    }
}
