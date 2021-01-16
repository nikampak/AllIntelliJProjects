package Repl;

public class it_Assessment_ApearsTwice {
    public static void main(String[] args) {
        String sentence = "I would like to buy a new laptop, because my laptop is too old.";
        String target = "laptop";

        String [] arrSentence = sentence.split(" ");
        int count = 0;
        for(String each : arrSentence){
            if(each.contains(target))
                count++;
        }
        if(count == 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
