package day28_MultiDimensionalArray;

public class TwoDimensionalArrays3 {
    public static void main(String[] args) {
        // 9 10 11 12 13
        // 4 5 6 7 8
        // 1 2 3

        int[][] arr2D = {  {1,2,3}, {4, 5, 6, 7, 8} , {9, 10,11,12, 13}  };
        //                     0            1               2
        for (int i = arr2D.length-1; i >=0; i--) {
            for (int each : arr2D[i]) {
                System.out.print(each + " ");
            }
            System.out.println();
        }
        System.out.println("+==========================");
        //                3 2 1
        //                8 7 6 5 4
        //                13 12 11 10 9
        for(int[] each1DArray : arr2D){

            for(int i = each1DArray.length-1; i >= 0; i-- ){
                System.out.print(each1DArray[i]+" ");
            }

            System.out.println();
            }

        }
    }
