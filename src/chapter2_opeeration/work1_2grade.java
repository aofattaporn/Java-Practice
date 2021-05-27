package chapter2_opeeration;

import java.util.Scanner;

public class work1_2grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Score");
        System.out.println("************************");
        System.out.print("Mid-term ( 40% ) : ");
        float mid = scanner.nextFloat();
        System.out.print("Final    ( 40% ) : ");
        float finall = scanner.nextFloat();
        System.out.print("Homework ( 20% ) : ");
        float hw = scanner.nextFloat();
        System.out.println("************************");
        float total = (mid + finall + hw);
        System.out.printf("Total = %.2f\n", total);
        char grade;
        if (total >= 80 ) {
            grade = 'A';
        }
        else if (total >= 70) {
            grade = 'B';
        }
        else if (total >= 60) {
            grade = 'C';
        }
        else if (total >= 50) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade = "+ grade);
        System.out.println("************************");



    }
}
