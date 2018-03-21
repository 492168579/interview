package com.yzy.interview.thread;

/**
 * Created by yezhaoyi on 2018/3/21.
 *
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}

