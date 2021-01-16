package day13_SwitchStatement;

public class Quiz {
    public static void main(String[] args) {
        float f1 = (12_345.1 > 123_45.0) ? 12_456: 124_56.02f;
        float f2 = f1 + 1024;
        System.out.println(f1);
        int x = 1;
        switch (x){
            case 1:
                System.out.println("O");
                break;
            case 2:
                System.out.println("T");
                break;
        }
        System.out.println("===========");
        int z = 10;
        switch(z){
            case 10:
                System.out.println("M");
            case 11:
                System.out.println("T");
            default:
                System.out.println("F");
        }
        System.out.println("++++++++++++");



    }
}
