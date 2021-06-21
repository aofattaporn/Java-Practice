package chapter10_ExceptionAndMultithread;

public class worl10_6threadjoin extends Thread{
    public static void main(String[] args) {
        // anonymous from class Thread
        Thread t1 = new Thread(){
            @Override
            public void run(){
                echo('1', 10);
            }
        };
        // anonymous from interface  Runnable
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                echo('*', 10);
            }
        };
        Thread t2 = new Thread(r2);


        // เริ่มการทำงาน

        t1.start();
        try {
            // ใช้ method join ให้มันทำงานตามเวลา
            t2.join();
        }catch (InterruptedException ex) {}
        t2.start();
    }
    public static void echo(char ch, int time){
        for (int i = 1; i <= time; i++ ){
            System.out.println(ch + " ");
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(50);
            }catch (InterruptedException ex) {}
        }
    }
}
