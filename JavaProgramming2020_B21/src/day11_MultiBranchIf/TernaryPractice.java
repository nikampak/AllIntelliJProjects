package day11_MultiBranchIf;

import java.sql.SQLOutput;

public class TernaryPractice {
    public static void main(String[] args) {
        int n = 100;

        String result1 = "";

        if(n%2==0){
            result1 = "Even";
        }else{
            result1 = "Odd";
        }

        System.out.println(result1);
        System.out.println("======================================");

        String result2 =  (n%2==0) ? "Even" : "Odd" ;

        System.out.println(result2);

        System.out.println("=======================================");

        int age = 25;
        String citizen = "USA";
        //Sting eligible = (age >= 18 && citizen == USA) ? "Eligible to vote": "Not eligible to vote";

        String eligibleToVote = ( age >= 18 && citizen =="USA" ) ? "Eligible to Vote" : "Not Eligible to Vote" ;

        System.out.println(eligibleToVote);

        System.out.println("==============================================");

        int ageP = 18;
        // String buyAlcohole = (age >= 21) ? "Eligible" : "Buy milk";

        String buyAlcohol = (ageP >=21) ? "Eligible to buy alcohol" : "Buy milk";
        System.out.println(buyAlcohol);
        System.out.println("===============================================");

        int number = 1000;
        String s1 = "";

        if(number>0){
            s1 = "Positive";
        }else if(number < 0){
            s1 = "Negative";
        }else{
            s1 = "Zero";
        }
        System.out.println(s1);
        // String S11 = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";


        String s2 = (number>0) ? "Positive" :(number<0) ? "Negative" : "Zero";
        System.out.println(s2);








    }
}
