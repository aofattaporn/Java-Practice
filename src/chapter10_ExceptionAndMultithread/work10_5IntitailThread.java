package chapter10_ExceptionAndMultithread;

public class work10_5IntitailThread {
    public static void main(String[] args) {
        PrintStar ps = new PrintStar();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();


        //setPriority
        ps.setPriority(2);
        pn.setPriority(Thread.MIN_PRIORITY);
        pc.setPriority(Thread.MAX_PRIORITY);

        // เรียกใช้การทำงานของ thread
        ps.start();
        pn.start();
        pc.start();
    }
}
class PrintStar extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" * ");
            try {
                // ต้องหน่วง เผื่อว่าให้ program สามารถเห็นนการทำงานที่ชัดเจนน
                Thread.sleep(10);
            }catch (InterruptedException ex ) { }
        }
    }
}
class PrintNum extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" 1 ");
            try {
                Thread.sleep(10);
            }catch (InterruptedException ex ) { }
        }
    }
}

class PrintChar extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" A ");
            try {
                Thread.sleep(10);
            }catch (InterruptedException ex ) { }
        }
    }
}
