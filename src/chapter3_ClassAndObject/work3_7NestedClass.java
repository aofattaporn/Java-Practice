package chapter3_ClassAndObject;

public class work3_7NestedClass {
    public static void main(String[] args) {

    }
    // Static Nested Class
    private static int sDispalcement = 100;
    private static  class snClass {
        public int getDisplacements_snc() {
            return sDispalcement;
        }
    }
}

