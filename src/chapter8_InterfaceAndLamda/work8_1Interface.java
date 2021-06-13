package chapter8_InterfaceAndLamda;

// การส้ราง class ทำดา
class Gnumeric {
    void getValue(){
        System.out.println("sdasd");
    }
}

// Interface 1
interface INumber {
    final int x = 100;
    void testInterface1();
    void testInterface2();
}
// Interface 2
interface INumber2 {
    final int x = 200;
    void testInterface3();
    void testInterface4();
}

//implements -> สามารถ implements ได้หลาย interface พร้อมๆกัน
class testInterface implements INumber, INumber2{
    @Override
    public void testInterface1() {
        // do nothing
    }
    @Override
    public void testInterface2() {
        System.out.println("print : testInterface2() ");
    }
    @Override
    public void testInterface3() {
        System.out.println("print : testInterface3() ");
    }
    @Override
    public void testInterface4() {
        System.out.println("print : testInterface4() ");
    }
}

public class work8_1Interface {
    public static void main(String[] args) {
        testInterface tsf = new testInterface();
        tsf.testInterface1();
        tsf.testInterface2();
        tsf.testInterface3();
        tsf.testInterface4();

    }
}
