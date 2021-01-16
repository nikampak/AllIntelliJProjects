package day08_ShortHand_Relational;

public class KgToPounds {
    public static void main(String[] args) {
        int kg = 100;
        double pounds = kg*2.20462;
        int total = (int) pounds;

        System.out.println(10+" kg equal to "+pounds+" pounds"); //10 kg equal to 220.462 pounds
        System.out.println(10+" kg equal to "+total+" pounds"); //10 kg equal to 220 pounds


    }
}
/*
write a program that can convert the given number of kg to pounds
            Note: MUST return integer result
            Ex:
                kg = 100;
                output:
                    10 kg equal to 220 pounds
            Hint: 1kg = 2.20462 pounds

 */