package chapter8_InterfaceAndLamda;

@FunctionalInterface
interface PrinttingWork8 {
    public void echo(String str);
}
@FunctionalInterface

interface multiply{
    public double mtp(int x, int y);
}

public class work8_5Lamda {
    public static void main(String[] args) {
        // imprements มาจาก Interface
        Printting p = (String str) -> {
            System.out.println(str);
        };
        // imprements มาจาก Interface
        multiply mtp = (int x, int y) -> x * y;


//        mtptest(mtp);
        p.echo("Hello");


    }
//    public static int mtptest(multiply m) {
//        return m.mtp(10, 2);
//    }

}

