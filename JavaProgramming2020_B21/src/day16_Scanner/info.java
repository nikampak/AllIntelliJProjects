package day16_Scanner;
import java.util.Scanner;
public class info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        input.close();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your employment. True or False");
        boolean employmentStatus = input.nextBoolean();

        double salary = 0;

        if(employmentStatus){
            System.out.println("What is your salary");
            salary = input.nextDouble();
        }
        System.out.println("full name: "+ firstName + " "+ lastName);
        System.out.println("Employed: " + employmentStatus);
        System.out.println("Salary: "+ salary);
    }
}
