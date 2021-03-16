import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String d = sdf.format(date);

        Calendar ca = Calendar.getInstance();
        int year = ca.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(d);
        double a = 25/2;
        System.out.println(a);
    }
}
