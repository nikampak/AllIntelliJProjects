package Repl;

public class it_111 {
    public static void main(String[] args) {
        int k = 1;
        int total = 0;

        do{
            total += k*k;
            // why we cannot place sout statement in her
            k++;
        }while(k <= 50);
        System.out.println(total);
    }
}
