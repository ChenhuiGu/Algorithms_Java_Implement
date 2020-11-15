package JavaSe;

public class Test4 {
    public static void main(String[] args) {
        Account a = new Account();
        User weixin = new User(a,2000);
        User zhifubao = new User(a,2000);
        Thread t1 = new Thread(weixin,"weixin");
        Thread t2 = new Thread(zhifubao,"zhifubao");
        t1.start();
        t2.start();
    }

}
class Account {
    public int Money = 3000;
    public void getMoney(int m) {
        String name = Thread.currentThread().getName();
        System.out.println("账户余额" + Money);
        System.out.println(name + "取款" + m);
        Money = Money-m;
        System.out.println("账户余额" + (Money));
    }
}

class User implements Runnable{
    Account a;
    int m;
    public User(Account a,int m){
        this.a = a;
        this.m = m;
    }
    @Override
    public void run() {
        a.getMoney(m);
    }
}
