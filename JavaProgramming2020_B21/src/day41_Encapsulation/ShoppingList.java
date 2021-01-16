package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("sanitizer", 30, 15),
                new Item("mask", 225, 10),
                new Item("watermelon", 2.24, 2),
                new Item("mask", 225, 10),
                new Item("sanitizer", 30, 15)
        ));
        System.out.println(items);

        double total = 0;
        for (Item eachItem : items){
            total += eachItem.calcCost();

        }
        System.out.println("total = " + total);
    }
}
/*
create a class called ShoppingList
            create 5 objects of Item and store them into ArrayList of Items

            calculate the total cost of all Items in the list
 */