package Repl;

public class it_156 {
    public static void main(String[] args) {

        int[] r = {1, 2, 3, 4, 5};

        int[] new_r = new int[r.length+1];
        for (int i=0; i<r.length; i++){
            new_r[i] = r[i];
            System.out.print(new_r[i]+", ");
        }
        new_r[new_r.length-1] = 6;
        System.out.print(new_r[new_r.length-1]);
        //1, 2, 3, 4, 5, 6

    }
}
