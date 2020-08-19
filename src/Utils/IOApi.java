package Utils;
import java.io.*;
import java.util.ArrayList;

public class IOApi {
//    BufferedReader bufferedReader;
//    public IOApi(FileReader fileReader){
//        this.bufferedReader = new BufferedReader(fileReader);
//    }
    BufferedReader bufferedReader;
    public IOApi(String FileName){
        File file = new File("");
        String path = file.getAbsolutePath()+"/data/"+FileName;
        try{
            FileReader fileReader = new FileReader(path);
            this.bufferedReader = new BufferedReader(fileReader);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    public String[] ReadFromFile(){
        try{
            String line = bufferedReader.readLine();
            return line.split(" ");
        }catch (IOException e){
            e.printStackTrace();
            return new String[1];
        }
    }
    public static void ReadFromStd() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符");
        char c;
        c = (char) bufferedReader.read();
        System.out.println("你输入的字符为"+c);
    }
    public static void main(String[] args) throws IOException{
//        File file = new File("");//Java project/Algorithm_self
//        System.out.print(file.getAbsolutePath()+ "/data/tinyTale.txt");
        IOApi file = new IOApi("tinyTale.txt");
        System.out.println(file.ReadFromFile());
        System.out.println(file.ReadFromFile());
        System.out.println(file.ReadFromFile());
        System.out.println(file.ReadFromFile());
        System.out.println(file.ReadFromFile());
        System.out.println(file.ReadFromFile());
    }
}