package com.yzy.interview.thread;

/**
 * Created by yezhaoyi on 2018/3/21.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}
