package JavaSe;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test_Io {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Deque<Integer> de = new LinkedList<>();
        de.
    }
    public static void testFileinputStream(){
        try {
            FileInputStream in = new FileInputStream("data/tinyTale.txt");
            byte[] b = new byte[1024];
            int len ;
            while ((len = in.read(b))!= -1){
                System.out.println(new String(b,0,1024));
            }
            in.close();
        }catch (Exception e){
            System.out.println("error in");
        }

    }
}
