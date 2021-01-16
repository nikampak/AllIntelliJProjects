package day16_Scanner;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the browser type");
        String browserName = input.nextLine();

        input.close();

        String result = "";

        switch (browserName) {
            case "firefox":
                result = "Firefox";
                break;
            case "opera":
                result = "Opera";
                break;
            default:
                System.out.println("Browser type is not a valid browser");
                break;
        }
        System.out.println("Browser type is opening "+browserName);
    }
}
