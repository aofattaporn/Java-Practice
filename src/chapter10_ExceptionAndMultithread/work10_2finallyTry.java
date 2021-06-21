package chapter10_ExceptionAndMultithread;

import java.util.Scanner;

public class work10_2finallyTry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = " ";
        double x;
        System.out.print("กรุราใส่เลขที่ต้องการ >> ");
        try {
            input = scan.next();
            x = Double.parseDouble(input);
        } catch (Exception ex) {
            System.out.println("ข้อมูลที่ใส่ แปลงเป็น  ...");
        } finally {
            System.out.println(" ข้อมูลที่ใส่เข้ามาคือ " + input);
            scan.close();
        }
    }
}
