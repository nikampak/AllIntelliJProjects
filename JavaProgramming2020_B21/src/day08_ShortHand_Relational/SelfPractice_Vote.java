package day08_ShortHand_Relational;

public class SelfPractice_Vote {
    public static void main(String[] args) {
        String name = "John";
        String citizenship = "USA";
        boolean eligibleToVote = citizenship == "USA";

        System.out.println(name+" is eligible to vote for Donald Trump or Joe Biden?");     // John is eligible to vote for Donald Trump or Joe Biden?
        System.out.println(eligibleToVote);                                                 // true

        String name1 = "Jimmy";
        String citizenship1 = "Korea";
        boolean eligibleToVote1 = citizenship1 == "USA";

        System.out.println(name1+" is eligible to vote for Donald Trump or Joe Biden?");     // Jimmy is eligible to vote for Donald Trump or Joe Biden?
        System.out.println(eligibleToVote1);                                                 // false
        System.out.println("============================================================");


    }
}
/*
2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
            name = "Jimmy"
            citizenShip = "Korea"
            output:
                Jimmy is eligible to vote for Donald Trump or Joe Biden?
                    false

 */