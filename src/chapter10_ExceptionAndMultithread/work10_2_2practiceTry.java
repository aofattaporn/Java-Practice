package chapter10_ExceptionAndMultithread;

import java.util.Scanner;

public class work10_2_2practiceTry {
    public static void main(String[] args) {
        // test method exceptiom
        int x = getInt();

        // general exception
        try {
            System.out.println(10/0);
        }
            // ดัก exception หลายๆตัวพร้อมกันได้เลย
            catch (NullPointerException | ArithmeticException ex) {
                ex.printStackTrace();
            }
            catch (Exception ex) {
                // อ่านข้อความที่แสดงการเกิด exception
                System.out.println(ex.getMessage());
                // อ่านข้อความที่แสดง package ของคราสพร้อมสาเหตุการเกิด
                System.out.println(ex.toString());
                // พิมพ์รายละเอียดทั้งหมดที่เกี่ยวข้อง
                ex.printStackTrace();
            }
    }

    // การจับ exception ใน method
    private static int getInt() {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.print("กรุณาใส่เลขจำนวนเต็ม >> ");
        try {
            result = scan.nextInt();
        } catch (Exception ex ) {
            System.out.println("ใส่ข้อมูลมะถูก");
            // เรียกทำเป็นแบบ Recursive
            getInt();
        }
        return result;
    }
}
