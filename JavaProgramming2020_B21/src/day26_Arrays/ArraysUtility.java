package day26_Arrays;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        int[ ] numbers = {1, 2, 3, 4, 5, 6};
//                        0,  1, 2, 3
        System.out.println(numbers [0]);    // 1
        System.out.println(numbers[1]);     // 2
        System.out.println(numbers[2]);     // 3
        System.out.println(numbers);        // [I@38af3868

        System.out.println(Arrays.toString(numbers));   // [1, 2, 3, 4, 5, 6]

        System.out.println("===========================");

        String [] classMates = {"Jane", "David", "Anna", "Jack", "Daniel"};
        System.out.println( classMates );                   // [Ljava.lang.String;@77459877
        System.out.println(Arrays.toString(classMates));    // [Jane, David, Anna, Jack, Daniel]
        System.out.println("==============================");
// sort
        int[] arr1 = {200000, 100000, 400000, 6000, 300000, 1234551, 90000};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println("Max = "+arr1[arr1.length-1]);
        System.out.println("Min = "+ arr1[0]);

        System.out.println("======================================");

        double[] arr2 = {1.5,0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5 } ;
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));      // [-0.75, -0.5, 0.0, 0.5, 1.5, 1.8, 2.5, 3.5, 10.5, 20.5]

        System.out.println("Second minimum number: " + arr2[1]);                // -0.5
        System.out.println("Second maximum number: "+ arr2[arr2.length-1-1]);   // 10.5

        System.out.println("=======================================");

        String [] names = {"Whitney", "David", "Anna", "Jack", "Bobby", "fred"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));     // [Anna, Bobby, David, Jack, Whitney, fred]
        System.out.println("=======================================");

        // equals(arr1, arr2)
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 3, 2};

        boolean r1= Arrays.equals(a1, a2);
        System.out.println(r1); // false

        Arrays.sort(a2);
        boolean r2= Arrays.equals(a1, a2);
        System.out.println(r2); // true











    }
}
