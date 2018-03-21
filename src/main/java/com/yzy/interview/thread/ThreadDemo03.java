package com.yzy.interview.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by yezhaoyi on 2018/3/21.
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        Callable<Object> oneCallable = new Tickets<Object>();
        FutureTask<Object> oneTask = new FutureTask<Object>(oneCallable);
        Thread t = new Thread(oneTask);
        System.out.println(Thread.currentThread().getName());
        t.start();
        System.out.println(oneCallable.toString());
    }

}
class Tickets<Object> implements Callable<Object> {
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"-->我是通过实现Callable接口通过FutureTask包装器来实现的线程");
        return (Object) "999";
    }
}