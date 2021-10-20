package JavaSe;
import java.time.*;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        //毫秒时间戳
        long time = date.getTime();
        System.out.println("当前时间戳:" + time);
        Calender.printCalender();
    }
}


class Calender{
    static void printCalender(){
        LocalDate now = LocalDate.now();
        //day
        int today = now.getDayOfMonth();
        //month
        int month = now.getMonthValue();
        LocalDate date = now.minusDays(today-1);
        System.out.println(date);


    }
}