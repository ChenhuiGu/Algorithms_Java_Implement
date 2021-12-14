package JVM;

public class ByteCodeSample {
    public static void main(String[] args) {
        doWhile();
    }
    static void doWhile(){
        int a = 0;
        do{
            a++;
        } while(a<10);
        System.out.println(a);
    }

}
