package com.kys.datastructure;

public class ThreadTest {

    public static int COUNT = 0;

    public static void main(String[] args) throws InterruptedException {

        Runnable runner = new Runnable() {

            @Override
            public void run() {
                synchronized (this){
                for (int i = 0; i < 50000; i++) COUNT++;
                }
            }
        };

        Thread th1 = new Thread(runner);
        Thread th2 = new Thread(runner);
        Thread th3 = new Thread(runner);
        Thread th4 = new Thread(runner);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        while(true){
            if(!th1.isAlive() && !th2.isAlive() && !th3.isAlive() && !th4.isAlive()){
                break;
            }

            Thread.sleep(1000);
        }

        System.out.println(COUNT);
    }
}
