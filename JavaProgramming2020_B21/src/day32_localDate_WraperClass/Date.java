package day32_localDate_WraperClass;
import java.time.LocalDate;
public class Date {
    public static void main(String[] args) {
        LocalDate yesterday = LocalDate.of(2020, 11, 22);
        System.out.println(yesterday);
        //LocalDate d1 = LocalDate.of(2019, 2, 29);
        // System.out.println(d1);

        System.out.println(  yesterday.isLeapYear() ); // Leap ==> true, otherwise ==> false


        LocalDate today = LocalDate.now();

        System.out.println(today);

        // LocalDate DofB

        String[] names={"Veronica","inna","Anna","Ruslan","Livio"};
        LocalDate[] birthdays = {
                LocalDate.of(1985,10,31),
                LocalDate.of(1995,02,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005, 04,20),
                LocalDate.of(2010, 05,25)
        };


        for( int i = 0; i <= names.length-1; i++){
            System.out.println( names[i] + "' birthday is: "+ birthdays[i]);
            System.out.println(names[i] +" was born on leap year: " +  birthdays[i].isLeapYear()+"\n" );

        }



    }
}
