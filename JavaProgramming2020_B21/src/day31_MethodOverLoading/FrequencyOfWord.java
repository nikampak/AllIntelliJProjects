package day31_MethodOverLoading;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "Today is a great day, today we are learning java, today we have java class";

        int count = frequensyOfWord(str, "today");
        System.out.println(count);

        String str2 = "java JAVA JAva c#, C#, c# java java";

        int countJava = frequensyOfWord(str2, "java");
        int countC = frequensyOfWord(str2, "C#");

        System.out.println(countJava);
        System.out.println(countC);
        System.out.println("==============================================");

        System.out.println(additionOf2Numbers(100, 200));
        System.out.println(additionOf3Numbers(100, 200, 300));
        System.out.println(additionOf4Numbers(100, 200, 300, 400));




    }
    public static int frequensyOfWord(String sentence, String word) {
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            frequency++;
        }


        return frequency;

            /*
    warmup tasks:
    Task1:
        1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequency(str, word) ==>  3

     */
    }

    public static int additionOf2Numbers(int a, int b){
        return a+b;

        /*
 Task2:
        1. create a method that can find the addition of two numbers
                    method name: additionOf2Numbers

 */
    }

    public static int additionOf3Numbers(int a, int b, int c){
   //     return a+b+c; <--- One way of calculating
        return additionOf2Numbers(a, b) + c;

        /*
 Task2:
        2. create a method that can find the addition of three numbers
                    method name: additionOf3Numbers

 */
    }

    public static int additionOf4Numbers(int a, int b, int c, int d){
  //      return a+b+c+d;
        return additionOf2Numbers(a, b) + additionOf2Numbers(c, d);
        /*
 Task2:
        3. create a method that can find the addition of four numbers
                    method name: additionOf4Numbers

 */
    }
}