package OSF.naukaJava.etap2.DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

    public static void main(String[] args) {
        //curent date..current time
        Date d=new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));
        System.out.println(d.toString());

        //mm//dd/yyyy HH:MM:SS


    }
}
