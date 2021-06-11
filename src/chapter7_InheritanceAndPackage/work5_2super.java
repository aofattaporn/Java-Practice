package chapter7_InheritanceAndPackage;
// test constructor of superclass from subclass
class superConstructor{
    private int msupcon;
    public superConstructor() {
        System.out.println("constructor of superclass no parameter ");
    }
    // constructor of superclass by 1 parameter
    public superConstructor(int supcon){
        System.out.println("constructor of superclass 1 parameter ");
    }

}
class subConstructor extends superConstructor{
    public subConstructor() {
        System.out.println("constructor of subclass no parameter ");
    }
    public subConstructor(int supcon) {
        System.out.println("constructor of subclass 1 parameter ");
    }
}


class Base {
    private int mValue;
    // constructor of super class
    public Base() {
        System.out.println("base constructor");
    }
    public Base(int Value){
        mValue = Value;
    }
    // getter method
    public int getmValue() {
        return mValue;
    }
}
class Derived extends Base {
    private int mtest;
    public int test( ) {
        return mtest;
    }
    // subclass จะมี constructor ได้ superclass ต้องมี default constructor ก่อนเสมอ
    public Derived() {
        System.out.println("กหดห");
    }
    // มีการใช้ super เพื่อถ่ายทอด constructor
    public Derived(int value){
        super(value);
    }


}



public class work5_2super {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("when create object from subclass ");
        subConstructor subC = new subConstructor();

        System.out.println("\n=======================================");
        System.out.println("when create object from subclass by 1 parameter ");
        subConstructor subC2 = new subConstructor(10);

        System.out.println("\n=======================================");
        Derived d = new Derived(10);
        System.out.println("การใช้ super ในsubclass : "+d.getmValue());
    }
}
