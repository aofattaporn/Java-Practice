package chapter10_ExceptionAndMultithread;

public class work10_4throws {
    public static void main(String[] args) {
       try {
           bar();
       }catch (Exception ex) {
           System.out.println(ex.getMessage());
           System.out.println("เกิดขอผิดพลาดจ้า");
       }
    }
    private static void bar() throws ArithmeticException, NullPointerException {
        int x = Integer.parseInt("4x2");
    }
}