package Office_Hours.Practice_11_26_2020;

public class LoopsPractice1 {
    public static void main(String[] args) {
        System.out.println("All numbers: ");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();

        // even numbers:
        System.out.println("Even numbers: ");
        for (int i = 2; i <= 50; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Odd numbers: ");
        for (int i = 1; i <= 50; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("===============================");
        System.out.println("Even numbers by using if stmt: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers by using if stmt & continue stmt: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0){
                continue;       // skipping
            }
            System.out.print(i+" ");
            if (i == 29) {
                break;          // exit the loop and switch stmt
            }
        }
        System.out.println();
    }
}
