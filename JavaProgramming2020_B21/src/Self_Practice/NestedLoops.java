package Self_Practice;

public class NestedLoops {
    public static void main(String[] args) {
 // nested for loop
        for( int r = 0; r < 5; r++) {                       // row
            for (int c = 0; c < 3; c++) {                   // column
                System.out.print("|Row" + r + "-Colum" + c+ "|");
            }
            System.out.println();
        }
        System.out.println("=============================");
        int [] rows = {};
// for each loop
        int [] Rows = {1, 2, 3, 4};
        int [] Cols = {1, 2, 3};

        for (int row: Rows) {

            for (int column : Cols) {
                System.out.print("row "+ row + "column " + column);
            }
            System.out.println();
        }
 // while loop

    }
}
