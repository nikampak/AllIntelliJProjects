package Office_Hours.Practice_11_04_2020;

public class SliceNumbers2 {
    public static void main(String[] args) {
        int number = 12345;
        String str = "" + number;   // "12345"

        for (int i = 0, j = 0; i <= str.length()-1; i++, j++) {
            System.out.println("Digit "+ j +": "+str.charAt(i));
        }
    }
}
