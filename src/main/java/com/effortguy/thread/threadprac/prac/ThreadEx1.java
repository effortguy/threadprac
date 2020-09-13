package com.effortguy.thread.threadprac.prac;

public class ThreadEx1 {
    public static void main(String[] args) {
        // Thread를 상속받으면 다른 클래스 상속 x, Runnable 사용 지향
        Thread t1 = new ThreadEx1_1();

        // 재사용성이 높고 일관성 유지할 수 있어 객제지향적인 방법
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("ThreadEx1_1 : " + getName());
        }
    }
}
class ThreadEx1_2 implements Runnable {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("ThreadEx1_2 : " + Thread.currentThread().getName());
        }
    }
}