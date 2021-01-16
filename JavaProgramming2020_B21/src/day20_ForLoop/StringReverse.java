package day20_ForLoop;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Veronica Pak";
        //            01234567
        String result = "";         // "kaP acinoreV"
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);


    }
}
/*
 5. write a program that can reverse any given string
            ex:
                input: abcd
                output: dcba
                input: Cybertek
                output: ketrebyC

 */