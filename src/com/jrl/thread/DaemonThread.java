package com.jrl.thread;

import java.util.concurrent.TimeUnit;
/**
* @author jrl
* @date 2021/4/17
*/
public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm daemon thread");
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("1");
                }
            }
        });
        /** knowledge point:
         *  守护线程是一种线程，当其他线程都执行结束以后，守护线程就会结束，那么该进程就结束了
         */
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + " is terminated");
    }
}
