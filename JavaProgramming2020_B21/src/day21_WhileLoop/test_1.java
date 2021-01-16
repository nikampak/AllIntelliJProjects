package day21_WhileLoop;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        int check = 132;
        String str = "";

        if (check % 2 == 0){
            str += check;
            if (check % 5 == 0){
                str +="132";
            }else{
                str = "500";
            }

        }else{
            str += "123";
        }
        System.out.println(str);
        System.out.println("+=================");
        int num = 2;
        boolean b = true;

        switch (num){
            case 0:
            b = false;
            case 1:
                System.out.println(1);
            case 2:
                if (b) {
                    System.out.println(2);
                }else{
                    b = false;
                }
            case 3:
                if (b) {
                    System.out.println(3);
                    b = false;
                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!b){
                    break;
                }
                System.out.println(5); // 234  ????????? Question # 25
        }
        System.out.println("+=================");
        Scanner scan = new Scanner(System.in);

        int one = scan.nextInt();
        int two = scan.nextInt();

        if(one-- > two * 2) {
            System.out.println("one");
        }else{
            System.out.println(two);
        }
        System.out.println("+=================");


    }
}
