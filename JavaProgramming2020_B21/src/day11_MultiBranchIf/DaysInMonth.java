package day11_MultiBranchIf;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = 4; // 1 to 12
        boolean has28Days = month == 2;
        boolean has30Days = month == 4 | month == 6 | month == 9 | month == 11;
        boolean has31Days = !has28Days && !has30Days;
        // boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7

        int days = 0;
        System.out.println(days);

        if(has28Days){
            days = 28;
        }
        if(has30Days){
            days = 30;
        }
        if(has31Days){
            days = 31;
        }
        System.out.println(days+ " days");
    }
}
/*
Warmup tasks: DaysInMonth
    1. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
            Ex:
                month = 2
                output:
                    28 days
                month = 9
                output:
                    30 days
        Hints: it cannot be done with if&else statement, you will need single if statements
        28 days: 2
        30 days: 4, 6. 9, 11
        31 days: 1, 3, 5, 7, 8, 10
 */