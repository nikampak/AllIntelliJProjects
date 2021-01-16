package day21_WhileLoop;

public class test {
    public static void main(String[] args) {
        int az = 5;
        byte bz = (byte)az;
        System.out.println(bz);
        System.out.println("===================");

        int a = -5;

        System.out.println(a++ + ",");
                        // -4,
        System.out.println(a = 0);
        System.out.println("," + --a);

        System.out.println("=============");

        short s = 13 - 9 / 3 * 10;
        //
        s += -10;
        System.out.println(s);

        System.out.println("==================");
        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9-10+1);
        System.out.println(two);
        System.out.println("==================");
        long l = 100;
        short s123 = (short) l;

        System.out.println(s123+10);
        System.out.println("==================");
        int ab = 10; //10
        ab = --ab + ab++ + ab-- + ab++;
        //      9 + 9    + 10   + 9
        System.out.println(ab);
        System.out.println("==================");
        short sb = 13+3*(10-6) %2;
        boolean bb= sb !=25;
        System.out.println(bb);
        System.out.println("==================");
        byte bc = 104;
        boolean check = bc < 100;

        if(check){
            bc-=100;
        }else{
            bc =50;
        }
        System.out.println(bc);
        System.out.println("==================");

        if(183 == 13 + 50 * 2 + 70){
            System.out.println("java");
        }else{
            System.out.println("Soft");
        }
        System.out.println("==================");
        int cookies = 10;
        String day = "tuesday";

        switch (day){
            case "sunday":
                cookies++;
                break;
            case"tuesday":
            case"wednesday":
                cookies +=10;
            case"thursday":
                cookies += 5;
                break;
            default:
                cookies = 0;
        }
        System.out.println(cookies);
        System.out.println("+=================");
        String str = "";
        int num = 20;
        switch (num){
            case 0: str = "C#";
            break;
            case 10: str += "is ";
            case 15: str = "fun";
            case 20: str += "java ";
            case 25: str += "is ";
            break;
            case 30: str += "fun";
            break;

        }
        System.out.println(str);
        System.out.println("+=================");
        double pi = 3.14;
        boolean bd = 119 % 5 == 0;
        int num00 = 0;

        if(pi > 3.14 && !bd){
            num00 +=50;
        }else {
            num00 -= 50;
        }
        if (bd) {
            num00 += 50;
        }
        System.out.println(num00);
        System.out.println("+=================");
        double decimal = 13.142;
        int whole = decimal < 20 ? 20 : 10;

        System.out.println(whole);
        System.out.println("+=================");
        String name = "Jimmy";
        boolean check1;

        if (name == "James"){
            check1 = false;
        }else{
            check1 = true;
        }
        String str1 = check1 ? "5" : "10";
       // System.out.println(str1 == 10);

        System.out.println("+=================");



    }
}
