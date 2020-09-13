package com.effortguy.thread.threadprac.prac;

public class ThreadEx5 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx5_1 t1 = new ThreadEx5_1();
        t1.start();
        startTime = System.currentTimeMillis();

        for (int i=0; i<300; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.println("소요시간1: " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }

    // result
    // 소요시간1: 47
    // 소요시간2: 47
}

class ThreadEx5_1 extends Thread {
    public void run() {
        for (int i=0; i<300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println("소요시간2: " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
