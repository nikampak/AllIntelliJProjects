package day11_MultiBranchIf;

public class DaysInWeek2 {
    public static void main(String[] args) {
        int n = 1;
        String result = "";

        if(n == 1){
            result = "monday";
        }else if(n == 2){
            result = "tuesday";
        }else{
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("============================");
        String result2 = (n==1) ? "monday" : (n==2) ? "tuesday" : "Innvalid";
        System.out.println(result2);
    }
}
