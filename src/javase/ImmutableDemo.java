package javase;

import java.util.Arrays;

/**
 * @author chenhuigu
 */
public class ImmutableDemo {
    public static void main(String[] args) {
        final Person person = new Person("lihua",12);
        //person.age = 14;
        //person = new Person("zhanghua",14);
        System.out.println("person = " + person);
    }
}

class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

