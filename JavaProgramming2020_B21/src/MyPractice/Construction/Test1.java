package MyPractice.Construction;

public class Test1 {

    public Test1(){

        System.out.println("A");
    }
    public Test1(int a){
        this();
        System.out.println("B");
    }
    public Test1(String str){
        this();
  //      this(100);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }
}
