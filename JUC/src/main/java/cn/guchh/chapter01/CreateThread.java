package cn.guchh.chapter01;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CreateThread {
    public static void main(String[] args) {
        // 方法一
        //Thread myThread = new MyThread();
        //myThread.start();
        // 方法二
        //Thread myThread = new Thread(new Thread01(),"Thread01");
        //myThread.start();
        //方法三
        FutureTask<Integer> task = new FutureTask<>(new Thread02());
        Thread myThread = new Thread(task,"Thread02");
        myThread.start();


    }


}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("the Thread " + this.getName() + " is running");
    }
}

class Thread01 implements Runnable{

    @Override
    public void run() {
        System.out.println("the Thread " + Thread.currentThread().getName() +  " is running");
    }
}

@Slf4j(topic = "c.thread02")
class Thread02 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        log.info("create thread");
        return 0;
    }
}