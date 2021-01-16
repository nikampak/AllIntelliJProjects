package MyPractice.Unit3;

public class q2 {
    public static void main(String[] args) {
        method2("the sun set quickly and created a shadow");
    }
    public static void method2(String s){
        String a = s.substring(10);
        if (a.length() > s.length() ){
            System.out.println(a);
        }else{
            System.out.println(s);
        }
    }
}
