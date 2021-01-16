package Repl;

import java.util.Scanner;

public class it_078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
scan.close();
        int o1, c1, o2, c2, o3, c3;

        o1= message.indexOf("<");
        c1= message.indexOf(">");
        o2= message.indexOf("[");
        c2= message.indexOf("]");
        o3= message.indexOf("{");
        c3= message.indexOf("}");

        sender = message.substring(o1+1, c1);
        phoneNumber = message.substring(o2+1, c2);
        messageBody = message.substring(o3 +1, c3);

        System.out.println("Sender: "+sender+"\nPhone Number: "+ phoneNumber+"\nMessage body: "+messageBody);



    }
}
