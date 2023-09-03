package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date d = new Date();
        DateFormat DF = new SimpleDateFormat("DD/MM/YYYY");
        String CD = DF.format(d);
        System.out.println("Current Date\t" + CD);

    }

}
