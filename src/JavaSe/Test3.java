package JavaSe;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        //继承Thread父类
//        Thread t1 = new TestThread();
//        t1.start();
//        Thread t2 = new TestThread();
//        t2.start();
        System.out.println("main线程程开始运行");
        Thread t1 = new Thread(new TestThread());
        t1.start();
        Thread t2 = new Thread(new TestThread());
        t2.start();
        t1.join();
        System.out.println("main线程结束运行");

    }
}

//class TestThread extends Thread{
//    @Override
//    public void run() {
//        String name = currentThread().getName();
//        System.out.println( name + "开始运行");
//        for(int i=0;i<6;i++){
//            System.out.println(name + "开始打印" + i);
//        }
//    }
//}

class TestThread implements Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println( name + "开始运行");
        for(int i=0;i<6;i++){
            System.out.println(name + "开始打印" + i);
        }
    }
}
