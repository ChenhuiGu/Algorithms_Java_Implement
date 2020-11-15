package JavaSe;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
    //Collections.hashset_test();
//        Collections.treeset();
//        Collection.hashmap();
        Collection.collections();
    }
    private static void hashset_test(){
        //Set set = new HashSet();
        //泛型
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        //迭代器
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //foreach
        for (String str:set
        ) {
            System.out.println(str);
        }
    }
    public static void treeset(){
        Set<Man> set = new TreeSet<Man>((new Man()));
        set.add(new Man(12,"张胜男"));
        set.add(new Man(35,"张三"));
        set.add(new Man(17,"李四"));
        set.add(new Man(66,"王五"));
        for (Man m:set
             ) {
            System.out.println("name:" + m.name + ",age:" + m.age);
        }
    }
    public static List<Man> arraylist(){
        List<Man> list = new ArrayList<Man>();
        list.add(new Man(12,"张胜男"));
        list.add(new Man(35,"张三"));
        list.add(new Man(17,"李四"));
        list.add(new Man(66,"王五"));
        return list;
    }
    public static void hashmap(){
        Map<Integer,String> map = new TreeMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        System.out.println(map);
        Set<Map.Entry<Integer,String>> entrys = map.entrySet();
        for (Map.Entry<Integer,String> en:entrys
             ) {
            System.out.println("The Key:" + en.getKey() + ",The Value:" + en.getValue());
        }
    }
    public static void collections(){
        List<Man> list = arraylist();
        for(Man m:list){
            System.out.println(m.age + "," + m.name);
        }
        System.out.print("-----------------------\n");

//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list,new Man());
//        list.sort(new Man());
//        Man max = Collections.max(list,new Man());
//        System.out.println(max.age + "," + max.name);
        Collections.swap(list,0,3);

        for(Man m:list){
            System.out.println(m.age + "," + m.name);
        }
    }
}
//同一个包下的同名类
class Man implements Comparator<Man>{
    int age;
    String name;
    public Man(){

    }
    public Man(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compare(Man o1, Man o2) {
        if(o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else {
            return 0;
        }

    }
}