package MyPractice.Loops;

public class q2 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 6) {
            a +=2;
        }
        System.out.println(a);

        int i = 0;
        int j = 7;

        for (i = 0; i < j-1; i +=2 ) {
            System.out.print(i + " ");
        }
        System.out.println("=============");
        for (int s = 0; s <=4; ) {
            s++;
            System.out.print(s + " ");
        }
        System.out.println("=============");
        String str = "Cybertek";
        str.concat("School");
        str.toLowerCase();
        System.out.println(str);
        System.out.println("++++++++++++++++++");
//        for (int b = 0; b < 5; b--) {
//            System.out.println("Hello");
//        }
        System.out.println("===================");
        int z = 5;
        for (int v = 5; v > 0; v--) {
            z+=v;
        }
        System.out.println(z);
    }
}
