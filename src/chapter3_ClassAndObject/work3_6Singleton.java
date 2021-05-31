package chapter3_ClassAndObject;

public class work3_6Singleton {
    public static void main(String[] args) {
        Circle_sigleton c1 = Circle_sigleton.getInstance();
        Circle_sigleton c2 = Circle_sigleton.getInstance();
        Circle_sigleton c5 = Circle_sigleton.getInstance();


    }
}
class Circle_sigleton {
    private static Circle_sigleton sCilee;

    private Circle_sigleton(){
        System.out.println("Hello");
    }

    public static Circle_sigleton getInstance(){
        if(sCilee == null) {
            sCilee = new Circle_sigleton();
        }
        return sCilee;
    }



}