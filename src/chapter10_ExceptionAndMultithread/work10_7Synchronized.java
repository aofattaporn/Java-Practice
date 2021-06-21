package chapter10_ExceptionAndMultithread;


public class work10_7Synchronized{
    public static void main(String[] args) {
        Printer p = new Printer();
        PrinterThread t1 = new PrinterThread(p, '1', 10);
        PrinterThread t2 = new PrinterThread(p, 'A', 10);
        t1.run();
        t2.run();
//        try {
//            t2.join(100);
//        }catch (InterruptedException ex){}
    }
}
// class Printer
class Printer {
    public  void echo(char c, int times){
        for (int i = 1; i<= times; i++) {
            System.out.println(c + " ");
            try {
                Thread.sleep(100);
            }catch (InterruptedException ex){}
         }
    }
}
// class PrinterThread
class PrinterThread extends Thread {
    // creating object
    private Printer mPrint;
    private char mChar;
    private int mTimes;

    public PrinterThread(Printer prn, char c, int times) {
        mPrint  = prn;
        mChar = c;
        mTimes = times;
    }
    @Override
    public void run() {
        mPrint.echo(mChar, mTimes);
    }
}
