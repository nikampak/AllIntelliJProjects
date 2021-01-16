package Repl;

import java.util.Scanner;

public class it_ifStatementBlackjack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        s.close();

        int house = s.nextInt();
        int player = s.nextInt();

        if (player >= 21) {
            System.out.println("bust");
        }else if (house > player) {
            System.out.println("player loss");
        }else if (player == house) {
            System.out.println("its a tie");
        }else if (player > house) {
            System.out.println("player wins");
        }else{
            System.out.println("Invalid");
        }
    }
}
