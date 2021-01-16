package day09_IfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {
        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 38;
        boolean hasCriminalBackgroung = false;
        boolean isEligible = isUSACitizen==true && age>= 18 && hasCriminalBackgroung == false;

        System.out.println(name +" is eligible to vote: " + isEligible); //Daniel is eligible to vote: true
        //                          true == true  && 38 > 18
        //                               true

        System.out.println(name +" is eligible to vote: " + isEligible);
        System.out.println("==============================================");

        String name1 = "Jimmy";
        boolean isUSACitizen1 = false;
        int age1 = 25;
        boolean hasCriminalBackgroung1 = true;
        boolean isEligible1 = isUSACitizen1==true && age1>= 18 && hasCriminalBackgroung1 == false;

        System.out.println(name1 +" is eligible to vote: " + isEligible1);

        System.out.println("==============================================");
        String name10 = "Jimmy";
        boolean isUSACitizen10 = false;
        int age10 = 25;
        boolean hasCriminalBackgroung10 = false;
        boolean isEligible10 = isUSACitizen10==true && age10>= 18 && hasCriminalBackgroung10 == false;

        System.out.println(name10 +" is eligible to vote: " + isEligible10);
        System.out.println("===========================");





    }
}
