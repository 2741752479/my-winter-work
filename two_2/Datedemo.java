package two_2;

import java.util.Date;

public class Datedemo {
    public static void main(String[] args) {
        myDate s1 = new myDate();
        s1.setYear(2022);
        s1.setDay(28);
        s1.setMonth(1);
        System.out.println(s1.getYear() + "/" + s1.getMonth() + "/" + s1.getDay());
        long time = System.currentTimeMillis();
        Date s2=new Date(time);
        System.out.println(s2);
        myDate s3=new myDate(2040,4,6);
        System.out.println(s3);
        Date s4=new Date();
        s4.setTime(s1.setDate(1000));
        System.out.println(s1.getYear() + "/" + s1.getMonth() + "/" + s1.getDay());
    }
}
