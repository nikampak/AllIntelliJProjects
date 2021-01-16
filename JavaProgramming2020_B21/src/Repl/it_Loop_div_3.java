package Repl;

public class it_Loop_div_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            while (i % 3 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}
