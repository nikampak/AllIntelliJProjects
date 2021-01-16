package day08_ShortHand_Relational;

public class SelfPractice_Alcohol {
    public static void main(String[] args) {
        String name = "James";
        int age = 19;
        boolean canBuyAlcohol = age >= 21;

        System.out.println(name+" is eligible to buy alcohol?");    //James is eligible to buy alcohol?
        System.out.println(canBuyAlcohol);                          //false


        String name1 = "Aaron";
        int age1 = 39;
        boolean canBuyAlcohol1 = age1 >= 21;
        System.out.println(name1+" is eligible to buy alcohol?");   //  Aaron is eligible to buy alcohol?
        System.out.println(canBuyAlcohol1);                         // true


    }
}
/*
1. write a program that can check if the person is eligible to buy alcohol
        Ex:
            name = "James"
            age = 19
            output:
                James is eligible to buy alcohol?
                    false
            name = "Aaron"
            age = 39
            output:
                Aaron is eligible to buy alcohol?
                    true

 */