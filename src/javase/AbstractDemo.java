package javase;

/**
 * @author chenhuigu
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Actor actor = new Actor(31,"赵丽颖","楚乔传");
        actor.eat();
        actor.doWork();
        actor.introduceSelf();
        actor.getSalary();
    }
}

/**
 * 演员类
 */
class Actor extends BasePerson implements Work{
    String work;

    public Actor(int age, String name,String work) {
        super(age, name);
        this.work = work;
    }


    @Override
    void eat() {
        System.out.println("actor eat food");
    }

    @Override
    public void doWork() {
        System.out.println("拍戏");
    }
}


abstract class BasePerson {
    int age;
    String name;

    public BasePerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 吃饭
     */
    abstract void eat();

    void introduceSelf(){
        System.out.printf("My name %s,My age %s\n",name,age);
    }
}

interface Work{
    /**
     * 工作
     */
    void doWork();
    /**
     * 获取薪水
     */
    default void getSalary(){
        System.out.println("今天领工资");
    }
}
