package Office_Hours.Practice_11_27_2020;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20 ,30, 40};   // length 4
                //   0    1  2   3
        int[] reverse = new int[arr.length];
 //             j++      i--
        reverse[0] = arr[3];
        reverse[1] = arr[2];
        reverse[2] = arr[1];
        reverse[3] = arr[0];

        for (int i = arr.length-1, j=0; i>=0; i--, j++ ){ // i : index numbers of arr in reversed order
            reverse[j] = arr[i];                           // j : index numbers of reverse array, in natural order
        }

        System.out.println(Arrays.toString(reverse));

        int[] arr2 = {400, 100 ,20, 300, 500 ,8800};
        arr2 = reverse( arr2);
        System.out.println(Arrays.toString(arr2));

        char[] arr3 = {'a', 'm', 'b', 't' };
        arr3 = reverse( arr3);
        System.out.println(Arrays.toString(arr3));

    }
    public static int[] reverse( int[]arr) {
        int[] reverse = new int[arr.length];

        for (int i = arr.length-1, j=0; i>=0; i--, j++ ){ // i : index numbers of arr in reversed order
            reverse[j] = arr[i];                           // j : index numbers of reverse array, in natural order
        }

        return reverse;
    }

    public static double[] reverse( double[] arr){
        double[] reverse = new double[arr.length];

        for (int i = arr.length-1, j=0; i>=0; i--, j++ ){ // i : index numbers of arr in reversed order
            reverse[j] = arr[i];                           // j : index numbers of reverse array, in natural order
        }

        return reverse;
    }
    public static char[] reverse( char[] arr){
        char[] reverse = new char[arr.length];

        for (int i = arr.length-1, j=0; i>=0; i--, j++ ){ // i : index numbers of arr in reversed order
            reverse[j] = arr[i];                           // j : index numbers of reverse array, in natural order
        }

        return reverse;
    }
}
