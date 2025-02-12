import java.time.*;
import java.util.*;

public class TimeAndDate {
    public static void main(String[] args) {
        Date d = new Date();
        d.setHours(21);
        System.out.println(d);
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
    }
}