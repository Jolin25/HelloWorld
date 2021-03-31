package com.jrl.thread;

/**
 * knowledge point:
 * 代码是被线程执行的，CPU是几核的就可以执行几个线程
 */
public class CreateThreadAppMain {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()+"主线程当前执行代码的线程是：" + Thread.currentThread().getName());
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new PrintStoryRunnable());
            thread.start();
        }
        System.out.println(System.currentTimeMillis()+"调完子线程后，主线程当前执行代码的线程是：" + Thread.currentThread().getName());
    }

    static class PrintStoryRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+"子线程---当前执行代码的线程是：" + Thread.currentThread().getName());
        }
    }
}
