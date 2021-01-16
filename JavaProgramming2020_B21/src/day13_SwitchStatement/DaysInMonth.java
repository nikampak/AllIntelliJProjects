package day13_SwitchStatement;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2022;
        int month = 33; // 1 - 12 months
        String result = "";

        if (month > 0 && month <= 12) {
            if (month == 2 && year % 4 == 0) {
                result = "29 days";
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    result = "30 days";
                } else {
                    result = "31 days";
                }

            } else {
                result = "28 days";
            }

        } else {
            result = "Invalid month";
        }
        System.out.println(result);
    }
}

