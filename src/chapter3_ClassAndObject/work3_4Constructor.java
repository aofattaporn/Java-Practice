package chapter3_ClassAndObject;

public class work3_4Constructor {
    public static void main(String[] args) {
        Horoscope hrs = new Horoscope();

    }
}
class Horoscope {
    // กำหนด field
    private String mWeekday, mZodiac, mConstellation;
    private int mDay, mMonth, mYearBE;
    // Constructor method
    public Horoscope(){
        System.out.println("\" Hello world test constructor mathode \"");
    }
    public Horoscope(String mWeekday, String mConstellation) {
        this.mWeekday = mWeekday;
        this.mConstellation = mConstellation;
    }
}