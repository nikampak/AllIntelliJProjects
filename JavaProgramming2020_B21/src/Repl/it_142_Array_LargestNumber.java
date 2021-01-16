package Repl;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class it_142_Array_LargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
//        for(int i=0 ;i<=rows-1;i++)
//        {
//            for(int j=0 ;j<=cols-1;j++)
//            {
//                arr[i][j]=inp.nextInt();
//            }//end for cols
//        }//end for rows
        for(int i=0, j=0 ;i<=rows-1;i++){

        }

        int max = arr[0][0];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (arr[i][j]>max)
                    max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
// Given a 2d array of ints, find the biggest number(int) in
// the array and print it.
