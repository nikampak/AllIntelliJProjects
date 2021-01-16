package day19_ForLoop;

public class selfPractice {
    public static void main(String[] args) {
        //1. print out the numbers between 0 ~ 1000
        for (int i = 0; i <= 1000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
//        2. print out the numbers between 1000 ~ 2000
        for (int j = 1000; j <= 2000; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
//          3. print out all the odd numbers between 0 ~ 1000
        for (int a = 0; a <= 1000; a +=2) {
            System.out.print(a + " ");
        }
        System.out.println();
//          4. print out all the even numbers between 0 ~ 100
        for (int s = 0; s>= 100; s+=2) {
            System.out.print(s + " ");
        }
            System.out.println();
//          5. do 50 push ups
//          6. write a program that can print a ~ z in same line separated by space
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
//          7. write a program that can print A ~ Z in same line separated by space
        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();

// word print out
        String word = "word!";
        for (int i = 0; i <= word.length(); i++) {
            System.out.println(word.charAt(i));           //w o r d !
        }
        System.out.println();
    }
}
