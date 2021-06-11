package chapter7_InheritanceAndPackage;
class Numeric_sup{
    private double mnumber;
    public void setMnumber(double num){
        mnumber = num;
    }

    public double getMnumber() {
        return mnumber;
    }
}

class Number_sub extends Numeric_sup{
    private int mInt;
    public void setmInt(int num) {
        mInt = num;
    }
}
public class work5_1modifySubclass {
    public static void main(String[] args) {
        Number_sub sub = new Number_sub();
        // สามารถใช้ method ของ super ได้
        sub.setMnumber(10);
        System.out.println("method ใน super class : " + sub.getMnumber());

    }
}
