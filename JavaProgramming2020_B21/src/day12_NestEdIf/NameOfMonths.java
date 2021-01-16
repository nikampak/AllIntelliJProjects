package day12_NestEdIf;

public class NameOfMonths {
    public static void main(String[] args) {
        int n = 100;

        String month = "";

        if(n >= 1 && n<= 12){
            month = (n==1)?"January":(n==2)?"February":(n==3)?"March":"April";

        }else{
            System.out.println("No such a month");
        }
    }
}
