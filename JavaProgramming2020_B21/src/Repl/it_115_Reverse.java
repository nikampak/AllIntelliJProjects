package Repl;

public class it_115_Reverse{
    public static void main(String[] args) {
        String word = "ABCD"; //DCBA

        String reverse = "";
        for (int i = word.length()-1; i <= 0; i--){
            reverse += word.toCharArray();
        }
        System.out.println(reverse);
    }
}
