package chapter7_InheritanceAndPackage;
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
        System.out.println(as.getValue(3));

    }
}
