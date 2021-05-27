package chapter2_opeeration;
import java.util.Scanner;

public class banknote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("จำนวนเงินที่ต้องการถอน : ");
        int withdraw = scan.nextInt();
        int b1000 = (withdraw / 1000);

        int remain = withdraw % 1000;
        int b500 = (int)( remain / 500);

        remain = remain % 500;
        int b100 = (int)( remain / 100);

        System.out.println("ชนิดธนบัตร ที่รับได : ");
        System.out.println("B1000:  "+ b1000);
        System.out.println("B500 :  "+ b500);
        System.out.println("B100 :  "+ b100);
    }
}
