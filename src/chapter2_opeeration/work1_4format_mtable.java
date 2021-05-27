package chapter2_opeeration;

import java.util.Scanner;

public class work1_4format_mtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("End number : ");
        int num = scanner.nextInt();
        System.out.print("  ");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%5d", i);
        }
        System.out.print("\n");
        for (int i = 1; i <= num; i++) {
            System.out.print(" " + i);
            for (int j = 1; j <= num; j++) {
                if (i >= j) {
                    System.out.printf("%5d", (i * j));
                }
            }
            System.out.println("");
        }



        System.out.println("\n\n\n");
        System.out.print("  ");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%5d", i);
        }
        System.out.print("\n");

        for (int i = 1; i <= num; i++) {
            System.out.print(" " + i);
            for (int j = 1; j <= num; j++) {
                if (i+j  >= num + 1) {
                    System.out.printf("%5d", (i * j));
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println("");
        }
    }
}
