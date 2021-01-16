package day10_IfElseStatement;

public class IfStatements {
    public static void main(String[] args) {
        int score = 45;

        if(score >=60){
            System.out.println("Congratulation");
        }
        if(score < 60){
            System.out.println("Keep trying");
        }
        System.out.println("+++++++++++++++++++++");
        if(score >= 60){
            System.out.println("Congratulation");
        }else{
            System.out.println("Keep trying");
        }
        System.out.println("===========================");
        int angle1 = 80;
        int angle2 = 75;
        int angle3 = 65;
        int angle4 = 75;

        boolean isValidRectangle = angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90;
                        // only if each of the angles are equal to 90 then it's valid
        if(isValidRectangle){
            System.out.println("It is a valid rectangle");
        }
        if(!isValidRectangle){
            System.out.println("Is is NOT valid rectangle");
        }
        System.out.println("=================================");
        if(isValidRectangle){
            System.out.println("It is a valid rectangle");
        }else{
            System.out.println("Is is NOT valid rectangle");
        }
        System.out.println("===================");

        int a = 200;
        int b = 3000;

        if(a > b ){
           // max = a;
            System.out.println("max: "+a);
        }else{
          //  max = b;
            System.out.println("max: "+b);
        }













    }
}
