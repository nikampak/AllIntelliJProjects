package Repl;

public class it_200_Methods_findErrorStr {
    public static void main(String[] args) {
        String line = "error foo bar";

//        for (int i = 0; i<=line.length()-1; i++){
//            if (line.startsWith("error")){
//                System.out.println(true);
//                break;
//            }else{
//                System.out.println(false);
//                break;
//            }
//        }

        Boolean hasError = line.startsWith("error");
        System.out.println(hasError);

    }
}
