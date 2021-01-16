package MyPractice.Unit3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class q5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yy");

        date = date.plusDays(1).minusYears(2).minusWeeks(1);
        System.out.println(date.format(format));
    }
}
