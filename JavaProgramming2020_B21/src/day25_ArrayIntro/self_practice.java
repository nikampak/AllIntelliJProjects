package day25_ArrayIntro;
import java.util.Arrays;
public class self_practice {
    public static void main(String[] args) {
      /*
task:
	write a program that can find the maximum and minimum number for an array of integer
 */
        int [] numbers = {1, 2, 3, 4, 5, 6, 9, 11, 8, 7, 10} ;
        int [] numbers2 = {1, 2, 3, 4, 5, 6, 9, 11, 8, 7, 10} ;
//Arrays.toString
        System.out.println(numbers [0]);                // 1
        System.out.println(Arrays.toString(numbers));   // [1, 2, 3, 4, 5, 6, 9, 11, 8, 7, 10]
        System.out.println("============================");
// equals
        boolean equals = Arrays.equals(numbers, numbers2);
        System.out.println(equals);                     // true
        System.out.println("=============================");
// sort
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));   // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        System.out.println("=============================");
// max number
        int max = numbers [0];
        for(int i = 0; i <= numbers.length-1; i++ ){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);         // max = 11
        System.out.println("=============================");
// min number
        int min = numbers [0];
        for(int i = 0; i <= numbers.length-1; i++ ) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);         // min = 1
        System.out.println("=============================");
// toCharArray
        String str = "acb";
        char [] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch)  );  // [a, c, b]
        System.out.println("=============================");
// split


    }
}
