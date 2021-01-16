package MyPractice.Unit2;

public class q5 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int iterate = input.nextInt();
//
//        int total = 0;
//
//        for (int j = 0; j < iterate; j++) {
//            if (j %3 == 0) continue;
//            total += num1 + num2;
//        }
//        System.out.println(total);
        System.out.println("=================");

        int count = 0;
        for (int a = 0; a < 4; a++) {
            if (a == 3) continue;
            for (int b = a+1; b < 5; b++) {
                count++;
                if (b == 3) break;
            }
        }
        System.out.println(count);
    }
}
