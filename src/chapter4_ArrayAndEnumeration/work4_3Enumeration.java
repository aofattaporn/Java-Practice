package chapter4_ArrayAndEnumeration;

public class work4_3Enumeration {
    public static void main(String[] args) {

        // การเก็ยข้อมูล enum
        Gender x = Gender.male;
        // การแปลงข้อมูฃล enum เป็น string
        String x2 = Gender.male.toString();

        // ลอง print ข้อมูล enum
        System.out.println(x);
        System.out.println(x2);
        if (x == Gender.valueOf(x2)) {
            System.out.println("yes");
        }
        System.out.println("===== loop ตาม enum class ==========");
        for (Gender i: Gender.values()) {
            System.out.println(i);
        }
        System.out.println("===== constructor ใน enum class ==========");
        System.out.println("ตัวย่อของ mail :" + Gender.male.getgd());
        System.out.println("==========================================");
    }
}
