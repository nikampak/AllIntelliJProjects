package MyPractice.Methods;

public class q4 {
    public static void main(String[] args) {
        int x = 7;
        if (available(x)) {
            System.out.println("Java SE");
        }else{
            System.out.println("Java EE");
        }
    }

    public static boolean available(int x) {
        return x > 1 ? true : false;

    }
}
