package day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 90;

        String result = "";

        if(score < 60){
            result = "Fail";
        }else if(score >= 60 && score < 90){
            result = "Pass";
        }else{
            result = "Passed with Distinction";
        }
        System.out.println(result);





    }
}
