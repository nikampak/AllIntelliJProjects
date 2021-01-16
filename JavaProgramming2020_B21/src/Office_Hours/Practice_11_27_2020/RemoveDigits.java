package Office_Hours.Practice_11_27_2020;

public class RemoveDigits {
    public static void main(String[] args) {
        String str ="abcd@#$%^&HI12345678JKL";

        String result = ""; //abcd@#$%^&HIJKL
//          OPTION #1
//        for (char each : str.toCharArray() ){
//            if (!Character.isDigit(each)) {
//                result += each;
//            }
//        }
//        System.out.println(result);
        for (char i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i);
//            if (!Character.isDigit(each)){
//                result += each;
            if (Character.isDigit(each)){
                continue;
            }
            result += each;
        }
        System.out.println(result);     //abcd@#$%^&HIJKL
    }
}
