package chapter2_opeeration;

import java.util.Scanner;

public class work1_price {
    public static void main(String[] args) {
        float price, net, discount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("product price : ");
        price = scanner.nextFloat();
        double vat = price * 0.07;
        if (price >= 1000) {
            discount = (float) (0.05 * (price+vat));
        }
        else {
            discount = (float) (0.10 * (price+vat));
        }
        System.out.println("******************************");
        System.out.printf("*  price        =    %-1.2f *\n", price);
        System.out.printf("*  price + vat  =    %1.2f *\n", vat + price);
        System.out.printf("*  discount     =     %-1.2f *\n", discount);
        System.out.printf("*  discount     =    %-1.2f *\n", ((price + vat) - discount));
        System.out.println("******************************");




    }
}
