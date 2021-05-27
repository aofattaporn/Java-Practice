package chapter2_opeeration;

import java.util.Scanner;

public class work1_3Multiple_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Begin : ");
        int begin = scanner.nextInt();
        System.out.print("End : ");
        int end = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            for (int j = begin; j <= end; j++) {
                System.out.printf("   %d* %-2d=%3d", j, i, i * j);
            }
            System.out.print("\n");
        }
    }
}
