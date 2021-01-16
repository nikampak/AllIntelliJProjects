package Repl;

public class it_Methods_extractNumbers {
    public static void main(String[] args) {
        String s = "aa2aa3"; //23

        String extractNumbers = "";
        char [] charArray = s.toCharArray();
        for (char each : charArray){
            if (Character.isDigit(each)){
                extractNumbers+=each;
            }
        }
        System.out.println(extractNumbers); //23

    }
}
