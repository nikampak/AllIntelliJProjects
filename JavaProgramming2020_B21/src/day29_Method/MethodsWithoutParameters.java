package day29_Method;

public class MethodsWithoutParameters {
    public static void main(String[] args) {
        printHello5Times();
        System.out.println("Muhtar");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

        MethodsWithoutParameters.printHello5Times();

        System.out.println("Odd Number: ");
        MethodsWithoutParameters2.printOddNumbers1To100();

        System.out.println("Even Number: ");
        MethodsWithoutParameters2.printEvenNumber1to100();

    }

        //AccessModifier  specifier   returnTYPE   MethodName (Parameter){
        public static void printHello5Times(){
            for (int i = 1; i <= 3; i++) {
                System.out.println("Hello");

        }


    }
}
/*
	    step1: print hello 5 times  (for loop)
		step2: print your name
		step3: print hello 5 times  (for loop)
		step4: print your school name
		step5: print hello 5 times   (for loop)
 */