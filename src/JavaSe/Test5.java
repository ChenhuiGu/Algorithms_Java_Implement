package JavaSe;
/**
消费者和生产者
 没有产品，开始生产；产品达到目标，开始生产
 */
public class Test5 {
    public static void main(String[] args) {
        Product p = new Product();
        new Thread(new Runnable() {
            @Override
            public void run() {
                    synchronized (p){
                    while (true){ //无限生产，无限消费
                        if(p.productNum == 0){
                            System.out.println("生产者开始生产");
                            while (p.productNum<4){
                                p.productNum++;
                                System.out.println("产品数量" + p.productNum);
                            }
                            p.notify();
                        }else {
                            System.out.println("生产者挂起");
                            try {
                                p.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        },"生产者").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (p){
                    while (true){ //无限生产，无限消费
                        if(p.productNum == 4){
                            System.out.println("消费者开始消费");
                            while (p.productNum>0){
                                p.productNum--;
                                System.out.println("产品数量" + p.productNum);
                            }
                            p.notify();
                        }else {
                            System.out.println("消费者挂起");
                            try {
                                p.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        },"消费者").start();
    }
}

class Product{
    int productNum;
}