package Repl;

import java.util.Scanner;

public class it_084 {
    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
scan.close();
        if (isPremiumCustomer == true) {
            if (nbooksPurchased >= 8) {
                freeBooks = 2;
            }else if (nbooksPurchased >= 5) {
                freeBooks = 1;
            }else {
                freeBooks = 0;
            }
        }else {
            if (nbooksPurchased >= 12 ) {
                freeBooks = 2;
            }else if (nbooksPurchased >= 7) {
                freeBooks = 1;
            }else{
                freeBooks = 0;
            }
        }
        System.out.println(freeBooks);
    }
}
