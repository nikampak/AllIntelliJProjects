package day30_ReturnMethods;

public class ReturnMethods {
    public static void main(String[] args) {
        reverseStr1("Magazine");
//        String reversedName = reverseStr2();
//        boolean isPalindrome =

    }

    //void
    public static void reverseStr1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

    }

    // return method:
    public static String reverseStr2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
