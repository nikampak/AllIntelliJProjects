package day14_Switch_Recap;

public class IfStatement_Quiz {
    public static void main(String[] args) {
        int num = 9;
        if (num++ == 10) {
            System.out.println("hello world " + num);
        } else {
            System.out.println("hello universe " + num);
        }
        System.out.println("==========================");
        int score = 0;
        if (score == 0) {
            score += 50;
        }
        if(score !=0){
            score +=50;
        }
        System.out.println(score);


            int x = 10;
            int y = x++;

            System.out.println(y++ + " " + x++ + " " + y);
        }
    }

