package Repl;

public class it_217_Methods_badProducts {
    public static void main(String[] args) {
        int[]products = {1,1,1,1,0,0};
        int limit = 1;
        boolean badP = false;

        int count = 0;
        for (int each : products){

            if (each == 0){
                count++;
                if (count < limit){
                    badP = true;
                }else{
                    badP = false;
                }
            }else{
                badP = true;
            }
        }
        System.out.println(badP);
    }
}
