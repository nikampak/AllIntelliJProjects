package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods2 {
    public static void main(String[] args) {
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

   //     Character ch = 'C';

        list2.remove(Character.valueOf('C'));
        System.out.println(list2);

    }
}
