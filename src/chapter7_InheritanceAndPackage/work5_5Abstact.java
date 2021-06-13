package chapter7_InheritanceAndPackage;
// abstract class
abstract class AbSuper {
    //Field of abstract method
    private double x1 = 10;
    // Abstract method
    protected abstract double sharpne();
    protected abstract int test ();
    // Concrete method
    protected double getValue(int x) {
        return (this.x1 * x);
    }
}

// override เพียง method เดียวดังนั้น ต้องใส่ keyword abstract
abstract class AbSub_2 extends AbSuper{
    @Override
    protected double sharpne() {
        return 32.23;
    }
}

// override ครบทุก method แล้วสามารถนำไปสร้าง object ได้เลย
class AbSub extends AbSuper {
    @Override
    protected double sharpne() {
        return 32.23;
    }
    @Override
    protected int test() {
        return 2;
    }
}


public class work5_5Abstact {
    public static void main(String[] args) {
        AbSub as = new AbSub();


    }
}
