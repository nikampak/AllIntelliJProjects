package Repl;

public class it_179 {
    public static void main(String[] args) {
        String str = "Darshada";
        String nonDup = "";

        for (int i = 0; i<= str.length()-1; i++ ){
            String ch = ""+str.charAt(i);
            if (nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }
        }
        System.out.println(nonDup);//Darshd
    }
}
/*
uniqueChars is a method that you will code now, should be able to accept any string
in the world and return unique characters from the parameter.

Examples:
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
 */