package chapter7_InheritanceAndPackage;
class Tea {
    protected String getClassNameTea() {
        return  "1";
    }
}
class IceTea extends Tea {
    @Override
    protected String getClassNameTea() {
        return  "2";
    }

}
class  LemonIceTea extends IceTea {
    @Override
    protected String getClassNameTea() {
        return  "3";
    }

}

public class work5_4Polymorphism {
    public static void main(String[] args) {
        // Dynamic Binding
        Tea t = new Tea();
        System.out.println(t.getClassNameTea());
        t = new IceTea();
        System.out.println(t.getClassNameTea());
        t = new LemonIceTea();
        System.out.println(t.getClassNameTea());

        System.out.println(t instanceof  Tea);


    }
}
