package com.effortguy.thread.threadprac.prac;

public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 t1 = new ThreadEx12_1();
        ThreadEx12_2 t2 = new ThreadEx12_2();
        t1.start();
        t2.start();

        try {
            //Thread.sleep(2000)으로 사용. 현재 쓰레드 기준으로 실행되기 때문에.
            t1.sleep(2000);
        } catch (Exception e) {}

        System.out.println("<<main 종료>>");
    }
}

class ThreadEx12_1 extends Thread {
    public void run() {
        System.out.println("<<th1 종료>>");
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        System.out.println("<<th2 종료>>");
    }
}