package JavaSe;
/**
 * 关于面向对象编程的测试
 */

public class Test2 {
    public static void main(String[] args) {
//        Test2.index0f();
//       Student s = new Student();
        Person p = new Student();
        //java14
//        if(p instanceof Student s){
//
//        }
        if(p instanceof Student){
            //向上转型
            Student s = (Student) p;
            s.setScore(122);
            System.out.println(s.getScore());
        }
        showargs("angle","bit","goto");


    }
    public static void index0f(){
        /**
         * @return:返回字符串子串的位置
         */
        String str = "guchenhui";
        int t1 = str.indexOf('u');
        int t2 = str.indexOf("eh");
        System.out.println(t1);
        System.out.println(t2);
    }

    /**
     * 可变参数
     * @param args
     */
    public static void showargs(String...args){
        for (String item:args) {
            System.out.println(item);
        }
    }
}

class Person {
    protected int age;
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

}

class Student extends Person{
    private int score;


    public void setScore(int score) {
        this.score = score;
        setAge(12);
    }

    public int getScore() {
        return score;
    }
}