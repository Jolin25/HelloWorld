package com.jrl.thread;

/**
 * wait notify
 *
 * @author jrl
 * @date 2021/4/18
 */
public class ThreadWaitNotify {
    public static void main(String[] args) {
        int threadCount = 5;
        for (int i = 0; i < threadCount; i++) {
            new Thread(
                    () -> {
                        System.out.println(getName() + ":线程开始工作...");
                    }
            ).start();
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }
}
