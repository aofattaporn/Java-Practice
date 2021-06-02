package chapter4_ArrayAndEnumeration;

public class work4_1TestArray {
    public static void main(String[] args) {
        int sum = 0;
        // การประกาศแบบที่ 1
        int nums1_test[];
        nums1_test = new int[2];
        nums1_test[0] = 250;

        // การประกาศแบบที่ 2
        int nums2_test[] = new int[2];
        nums2_test[0] = 220;

        // การประกาศแบบที่ 3
        int[] nums3_test = {10, 20, 30, 40, 50};

        System.out.println("การประกาศแบบที่ 1 >> "+nums1_test[0]);
        System.out.println("การประกาศแบบที่ 2 >> "+nums2_test[0]);
        System.out.println("การประกาศแบบที่ 3 >> "+nums3_test[0]);

        System.out.println("===== การเข้าถึง Array ===============");
        // การเข้าถึง array โดยไม่ใช้ตัวนับ i
        for (int x: nums3_test) {
            System.out.println(x);
        }
        for (int i = 0; i < nums3_test.length ; i++) {
            sum += nums3_test[i];
        }
        System.out.println("sum = "+ sum);
        System.out.println("===================================");

    }
}
