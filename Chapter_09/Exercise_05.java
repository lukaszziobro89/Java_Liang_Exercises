package Chapter_09;
import java.util.GregorianCalendar;
public class Exercise_05 {
    public static void main(String[] args) {

        // create calendar object
        GregorianCalendar calendar = new GregorianCalendar();

        // print current date
        System.out.print(calendar.get(GregorianCalendar.YEAR) + "-"
                + calendar.get(GregorianCalendar.MONTH) + "-"
                + calendar.get(GregorianCalendar.DATE));

        // set specified elapsed time
        System.out.println("");
        calendar.setTimeInMillis(1234567898765L);

        // print date
        System.out.print(calendar.get(GregorianCalendar.YEAR) + "-"
                + calendar.get(GregorianCalendar.MONTH) + "-"
                + calendar.get(GregorianCalendar.DATE));
    }
}
