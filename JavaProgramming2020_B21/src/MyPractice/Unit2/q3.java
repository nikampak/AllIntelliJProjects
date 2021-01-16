package MyPractice.Unit2;

public class q3 {
    public static void main(String[] args) {
        int a = 0;
        do{
            a = a++ + --a - (a % 3);
        }while (++a < 4) ;
        System.out.println(a);
        System.out.println("===========");

        String str = "The whole time it was raining.";
        do {
            System.out.print(str.charAt(0));
            str = str.substring(3);
        }while(! str.isEmpty());
        System.out.println();
        System.out.println("============");

        String s = "I will find the lost book";
        String word = "";

        for (int index = s.length()-1; index <=0; index--){
            word += s.charAt(index);
        }
        System.out.println(word);
        System.out.println("=============");


    }
}
