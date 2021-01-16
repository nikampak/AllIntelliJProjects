package MyPractice.Unit2;

public class q4 {
    public static void main(String[] args) {
        String str = "cybertek";
        for (int i = 0; i <= str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("+++++++++++++");

        String input = "today it will be 100 degrees !";
        int n = 0;
        while (n++ < input.length() ) {
            if (n == 8) {
                continue;
            }else if(n == 9) {
                break;
            }
            System.out.print(input.charAt(++n));
        }
        System.out.println();
        System.out.println("=============");


    }
}
