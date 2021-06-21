package chapter10_ExceptionAndMultithread;

public class work10_3throw {
    public static void main(String[] args) {
        int y = 0;
        try {
            if (y == 0 ) {
                // การโยน exception
                ArithmeticException arEx = new ArithmeticException("ตัวหารเป็น 0 ไม่ได้");
                throw arEx;
//            throw new ArithmeticException("ตัวหารเป็น 0 ไม่ได้");
            }
        }catch (ArithmeticException arEx) {
            System.out.println("tes");
        }


    }
}
