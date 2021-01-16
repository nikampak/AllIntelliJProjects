package Repl;

public class it_162 {
    public static void main(String[] args) {
        int num = 8;

        int [] arr = new int[num+1];        // 2 -> [0, 1, 1]
        arr[1] = 1; // set index 1 to 1, according to Fibonacci
        for (int i = 0; i <= arr.length-3; i++){// 3 items at a time
            arr[i+2] = arr[i] + arr[i+1];   // 2 = 1 + 1
        }
        System.out.println(arr[arr.length-1]); //21
    }
}
/*
In Fibonacci series, next number is the sum of previous two numbers for example
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
The first two numbers of the Fibonacci series are 0 and 1.
You are given a number num, print n-th Fibonacci Number.
Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1 --> 1)

Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)

 */