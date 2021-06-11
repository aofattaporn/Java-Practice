package chapter7_InheritanceAndPackage;
// superclass
class FirstProtect {
    protected double Version = 1.0;
    protected String mReleaseData = "0.1/10/2016";
    protected void superOverload() {
        System.out.println("method from superclass");
    }
    final protected int x = 20;
}

// subclass
class SecondProtect extends FirstProtect {
    // เป็นการเปลี่ยน feild โดยเขียน shadow มาทับ ค่าทับไปเลย
    protected double Version = 3.0;
    @Override // -> ใช้ annotation Override
    protected void superOverload() {
        System.out.println("Override method from subclass");
    }
    // ต้องการใช้ method ของ superclass หลังจากที่ใช้ override
    protected void superOverload_super() {
        super.superOverload();
    }

//    x = 30;

}



public class work5_3Override1 {
    public static void main(String[] args) {
        System.out.println("======= object ของ superclass =============");
        FirstProtect fp = new FirstProtect();
        System.out.println("Before shadow -> " + fp.Version);
        fp.superOverload();

        System.out.println("\n======= object ของ subclass =============");
        SecondProtect sp = new SecondProtect();
        System.out.println("After shadow  -> " + sp.Version);
        sp.superOverload();

        // การทำ Anonymous
        SecondProtect sp2 = new SecondProtect(){
            @Override // -> ใช้ annotation Override
            protected void superOverload() {
                System.out.println("\n --- Anonymous --- ");
            }
        };
        sp2.superOverload();

        // ใช้key world super เมื่อต้องใช้ methood ของ
        System.out.print("\nถ้าต้องการใช้ method ของ superclass : ");
        sp.superOverload_super();

    }

}
