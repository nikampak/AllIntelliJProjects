package Repl;

import java.util.Scanner;

public class it_151 {
    public static void sign(int n)
    {
        //your code here
        int result = (n > 0)? 1 : (n < 0)? -1 : 0;
        System.out.println(result);

    }//end sign

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);


    }
}
