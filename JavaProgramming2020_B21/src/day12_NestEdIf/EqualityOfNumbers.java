package day12_NestEdIf;

public class EqualityOfNumbers {
    public static void main(String[] args) {
        int n1 = 400;
        int n2 = 600;
        int n3 = 700;

        // for n1 & n2 are equal=   n1 == n2 && n1 != n3
        // for n2 & n3 are equal=   n2==n3 && n2 != n1
        // for n1 & n3 are equal=   n1==n3 && n1 != n2
        // for all equal=           n1 == n2 && n2 == n3

        // none of them are equal=  n1 != n2 && n2 != n3 && n1 != n3

        String result = "";
        if(n1 == n2 && n2 == n3){
            result = "All of them are equal";
        }else if(n1 == n2){
            result = "n1 & n2 are equal";
        }else if(n1 == n3){
            result = "n1 & n3 are equal";
        }else{
            result = "none of them are equal";
        }
        System.out.println(result);

        String result2 = (n1 == n2 && n2 == n3) ? "All of them are equal" : (n1 == n2) ? "n1 & n2 are equal" : (n1 == n3) ? "n1 & n3 are equal" : "none of them are equal";
        System.out.println(result2);

    }
}
