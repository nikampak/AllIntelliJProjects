package day26_Arrays;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        //               0  1  2  3   4  5  6

        int max = numbers [0];
        for(int i = 0; i <= numbers.length-1; i++ ){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }


        System.out.println("max = " + max);

        }

    }
