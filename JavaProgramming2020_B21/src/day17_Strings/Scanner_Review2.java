package day17_Strings;
import java.util.*;
public class Scanner_Review2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name");
        String product = input.nextLine();

        input.close();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter their full name");
        String fullName = input.nextLine();

        System.out.println(product);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(fullName);

        System.out.println(fullName+ " your order for "+ quantity + " "+product+ " has been place. Your total is "
        + "$"+(price*quantity));


    }
}
