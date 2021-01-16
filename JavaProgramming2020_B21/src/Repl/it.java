package Repl;

import java.util.Scanner;

public class it {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        scan.close();

        if(count2>0 && count3>0){
            System.out.println("Item1: "+item1+" Price: "+ (count1*price1)+", Item2: "+
                    item2+" Price: "+ (count2*price2)+", Item3: "+
                    item3+" Price: "+ (count3*price3));
            System.out.println("Total price: "+ ((count1*price1)+(count2*price2)+(count3*price3)));
        }else if(count2==0 && count3>0){
            System.out.println("Item1: "+item1+" Price: "+ (count1*price1)+", Item3: "+
                    item3+" Price: "+ (count3*price3));
            System.out.println("Total price: "+ ((count1*price1)+(count3*price3)));
        }else if(count3==0 && count2>0){
            System.out.println("Item1: "+item1+" Price: "+ (count1*price1)+", Item2: "+
                    item2+" Price: "+ (count2*price2));
            System.out.println("Total price: "+ ((count1*price1)+(count2*price2)));
        }else{
            System.out.println("Invalid");
        }

    }
}
