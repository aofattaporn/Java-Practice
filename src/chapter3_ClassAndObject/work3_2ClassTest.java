package chapter3_ClassAndObject;

public class work3_2ClassTest {
    public static void main(String[] args) {
        // การสร้าง object มาใช้นอก class
//        MyStringg mystr = new MyStringg();
//        String x = "Hello world";
//        int times = 5;
//        mystr.printStringRepeat(x,times);

    }
}

class MyStringg {
    // ตัวแปร Fied ปกติจะกำหนดเป็นแบบ private
    private double PI = 3.14;
    private int i = 1;

    public String getStringRepeat(String str, int times) {
        String s = "";
        for (i = 1; i <= times; i++) {
            s += str;
        }
        return s;
    }

    public void printStringRepeat(String str, int times) {
        System.out.println(getStringRepeat(str, times));
    }

}

class work2_1Method_Banking {
    private double mBalance = 0;
    private String mAccounType = "saving";

    public void setAccountType(String accType) {
        mAccounType = accType;
    }

    private String getAccounType() {
        return mAccounType;
    }

}

