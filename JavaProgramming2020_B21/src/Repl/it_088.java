package Repl;
import java.util.Scanner;
public class it_088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();



        for (int i = 0; i <=word.length()-3; i++){
            String currentWord = word.substring(i, i + 3);
            if (currentWord.equalsIgnoreCase("cat")) {
                countOfCats ++;
            }else if (currentWord.equalsIgnoreCase("dog")){
                countOfDogs++;
            }
        }
        System.out.println(countOfCats == countOfDogs );

    }
}
