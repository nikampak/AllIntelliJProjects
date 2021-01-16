package Repl;

public class it_Methods_findErrorString {
    public static void main(String[] args) {
        String line = "error foo bar"; // true (starts with "error" word)

        String firstWord = line.substring(0, 5);
        if (firstWord.contains("error")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
