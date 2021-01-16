package MyPractice.Unit3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class q4 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("h:mm a");

        time.plusHours(2);
        System.out.println(time.format(format));

    }
    }
