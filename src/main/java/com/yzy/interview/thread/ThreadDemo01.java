package com.yzy.interview.thread;

/**
 * Created by yezhaoyi on 2018/3/21.
 * idea  重写快捷键 CTRL+O
 */
class ThreadDemo01 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args){
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        threadDemo01.setName("继承Thread类的线程");
        threadDemo01.start();
        System.out.println(Thread.currentThread().getName());
    }
}
