package MyPractice.String;

public class q_2 {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta + tb;

        String str = " ";
        str.trim();
        boolean A = str.isEmpty();
        System.out.println(A);

        String str1 = "Java";
        String str2 = new String("java");
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
