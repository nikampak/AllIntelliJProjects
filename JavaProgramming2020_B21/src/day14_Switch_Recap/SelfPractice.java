package day14_Switch_Recap;

public class SelfPractice {
    public static void main(String[] args) {

        int player = 7;
        int house = 6;

        String output = "";

        if (player > 21) {
            output = "bust";
        } else if (player < 0 && player >= 21 && house > player) {
            output = "player loss";
        } else if (player == house) {
            output = "it's a tie";
        } else {
            output = "player wins";
        }
        System.out.println(output);

        System.out.println("=======================");

        int grade = 99;
        String output1 = "";

        if (grade > 90 && grade <= 100) {
            output1 = "excellent";
        } else if (grade > 70 && grade < 90) {
            output1 = "good";
        } else if (grade > 60 && grade < 70) {
            output1 = "pass";
        } else if (grade < 60) {
            output1 = "fail";
        } else {
            output1 = "invalid";
        }
        System.out.println(output1);

        int num1 = 55;
        int num2 = 66;
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
        int n1 = 1;
        int n2 = 3;
        int n3 = 5;

        String result = "";

        if(n1>n2 && n1>n3){
            result = "n1 is bigger";
        }else if(n2>n1 && n2>n3){
            result = "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }
        System.out.println(result);

        int day = 2;

        String Result = "";

        if(day == 1){
            Result = "It's a Monday!";
        }else if(day == 2){
            Result = "It's a Tuesday!";
        }else if(day == 3){
            Result = "It's a Wednesday!";
        }else if(day == 4){
            Result = "It's a Thursday!";
        }else if(day == 5){
            Result = "It's a Friday!";
        }else if(day == 6){
            Result = "It's a Saturday!";
        }else if(day == 7){
            Result = "It's a Sunday!";
        }else{
            Result = "Invalid";
        }
        System.out.println(Result);








    }
}
