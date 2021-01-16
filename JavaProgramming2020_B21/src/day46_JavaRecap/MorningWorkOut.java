package day46_JavaRecap;

public class MorningWorkOut {

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println("Push Up"+i);
            sleep(1.5);
        }
        System.out.println("====================================");

        for (int i = 1; i <=5; i++) {
            System.out.println("Pull Up" + i);
            sleep(2.5);
        }
    }


    public static void sleep(double seconds){ // 2.5

        try {
            // (long) (2500.0)
            Thread.sleep((long) (seconds * 1000));
        }catch (InterruptedException e){

        }

    }
}
