package chapter4_ArrayAndEnumeration;

import java.util.Arrays;
import java.util.Scanner;

public class work4_2MethodArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input length : ");
        int length = scan.nextInt();
        int[] nums = new int[length];

        String st2 = "Hello W orld";
        String[] str = st2.split(" ");

        nums = getRandomNumsTestt(length);

        System.out.println("===== Random number ==============");
        for (int x: nums) {
            System.out.println(x);
        }
        System.out.println("===== Sort number ==============");
        Arrays.sort(nums);
        for (int x: nums) {
            System.out.println(x);
        }
        int x = Arrays.binarySearch(nums, 4);
        if (x >= 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }
        System.out.println("===== length arrays ==============");
        System.out.println("array size : "+ nums.length);
        System.out.println(str[1]);
    }


    public static int[] getRandomNumsTestt(int length) {
        int[] nums = new int[length];
        for (int i= 0; i< nums.length; i++){
            nums[i] = (int) (Math.random() * 10);
        }
        return nums;
    }
}
