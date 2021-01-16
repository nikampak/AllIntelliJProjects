package Repl;

import java.util.Arrays;

public class it_132_Array_DeclareAndCreate2 {
    public static void main(String[] args) {
        char[] arr1D1 = {'a', 'b', 'c'};
        char[] arr1D2 = {'d', 'e', 'f'};
        char[] arr1D3 = {'g', 'h', 'i'};
        char[] arr1D4 = {'j', 'k', 'l'};
        char[] arr1D5 = {'m', 'n', 'o'};
        char[] arr1D6 = {'p', 'q', 'r'};

        char[][] arr2D1 = { {'a', 'b', 'c'}, {'d', 'e', 'f'} };
        char[][] arr2D2 = { {'g', 'h', 'i'}, {'j', 'k', 'l'} };
        char[][] arr2D3 = { {'m', 'n', 'o'}, {'p', 'q', 'r'} };

        char[][][] tictactoe = {arr2D1, arr2D2, arr2D3};
        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(tictactoe));
    }
}
