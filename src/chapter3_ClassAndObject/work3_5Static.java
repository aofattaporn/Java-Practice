package chapter3_ClassAndObject;

public class work3_5Static {
    public static void main(String[] args) {
        // ไม่ต้องสร้าง object
        long_static.String();
        long_static lstatic_test = new long_static();
        long_static lstatic_test2 = new long_static();

        System.out.println("=========================");
        lstatic_test.setsRadiuss_static(10);
        System.out.println(lstatic_test.getsRadiuss_static());
        System.out.println(lstatic_test2.getsRadiuss_static());
        System.out.println("=========================");

    }
}
class long_static {
    private static int static_variable;
    private static double sRadiuss =0;

    public void setsRadiuss_static(double Radius){
        this.sRadiuss = Radius;
    }
    public double getsRadiuss_static() {
        return sRadiuss;
    }
    public static void String(){
        System.out.println("Test static method ");
    }
}