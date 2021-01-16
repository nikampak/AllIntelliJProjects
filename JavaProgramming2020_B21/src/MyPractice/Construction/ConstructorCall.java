package MyPractice.Construction;

public class ConstructorCall {

   public ConstructorCall(int a){
        System.out.println("Constructor with int arg");
        this.a = a;
    }
    int a;
    public static void main(String[] args) {
        int num = new ConstructorCall(200).a;
        ConstructorCall obj1 = new ConstructorCall(300); //Constructor with int arg

        ConstructorCall obj2 = new ConstructorCall(400); //Constructor with int arg
    }
}
