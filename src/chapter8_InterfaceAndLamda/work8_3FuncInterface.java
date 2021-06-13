package chapter8_InterfaceAndLamda;
// FunctionalInterface -> interface ที่มีเพียง abstract method
@FunctionalInterface
interface Printting {
    public void echo(String str);
}

// Implements interface Printting
class Printer implements Printting {
   @Override
    public void echo(String str){
        System.out.println(str);
    }
}

// สร้าง object จากของ Printer
public class work8_3FuncInterface {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.echo("Hello");
    }
}
