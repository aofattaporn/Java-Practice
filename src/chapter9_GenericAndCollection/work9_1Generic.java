package chapter9_GenericAndCollection;
// นำเครื่องดื่มบางชนิดมาสร้างเป็น class
class Coffee{
    public final String df = "กาแฟ";
}
class Tea{
    public final String df = "ชา";
}

// create Generic class
class Cup<Drink>{
    Coffee coffee = new Coffee();
    Tea tea = new Tea();
    private Drink mDk;
    public void setDrink(Drink dk){
        this.mDk = dk;
    }
    public String getDrinkName() {
        return coffee.df;
    }
}

public class work9_1Generic {
    public static void main(String[] args) {
        // create object from generic class
        Cup<Coffee> cup = new Cup<Coffee>();
        Cup<Tea> cupOfTea = new Cup<Tea>();

        // create object from class
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        // use method setter and getter
        cup.setDrink(coffee);
        System.out.println(cup.getDrinkName());
        cupOfTea.setDrink(tea);
        System.out.println(cup.getDrinkName());



    }
}
