package MyPractice.Unit3;

public class Test {
    public static boolean method5(String str){
        boolean check = true;
        if (str.isEmpty()){
            check = false;
        }
        if (!str.contains("a")) {
            check = false;
        }else if(str.contains("z")){
            check = false;
        }
        check = str.substring(0, 1).equals("a") ? check : false;
        return check;
    }

    public static void main(String[] args) {
        System.out.println(method5("apple"));
    }
}
