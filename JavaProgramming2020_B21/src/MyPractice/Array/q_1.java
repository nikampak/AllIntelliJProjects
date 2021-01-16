package MyPractice.Array;
import java.util.Arrays;
public class q_1 {
    public static void main(String[] args) {
        int  arr [] = {1, 2, 3};

        char[] array = {'D', 'C', 'A', 'B'};
        Arrays.sort(array);

        for (char each : array) {
            System.out.print(each + " ");
            if (each == 'D') {

                continue;
            }
        }
        int wd = 0;
        String [] days = {"sun", "mon", "wed", "sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd +=2;
            }
        }
        System.out.println(wd);

        System.out.println();

        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4, 5};
        num1 = num2;
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));

        System.out.println();

        String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();
        System.out.println(x + " " + y);

        int arr1 [] = {1, 2, 3, 4};
        int i = 0;
        do{
            System.out.println(arr1[i] + " ");
            i++;
        }while(i<arr1.length-1);






    }


}
