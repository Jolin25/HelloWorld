package com.jrl.learn.learn_this;

/**
 * knowledge point:
 * this 自引用
 *  this指的是调用该方法的对象或使用该成员变量的对象
 *  所有的成员变量其实都是this.xxx，编译的时候会自动给补上
 */
public class LearnThis {
    // 成员变量a
    int a;

    public static void main(String[] args) {
        new LearnThis().test(1);
    }

    // 方法形参a
    public void test(int a) {
        System.out.println(a);// 1
        this.a = 2;
        System.out.println(this.a);// 2
        System.out.println(this);
    }
}
