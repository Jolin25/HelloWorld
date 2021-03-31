package com.jrl.thread;

public class StopALittile {
    public static void main(String[] args) {
        printSlowly("hello\nworld",300);
    }

    public static void printSlowly(String text, long interval) {
        for (char c : text.toCharArray()
        ) {
            try {
                Thread.sleep(interval);
                System.out.print(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
