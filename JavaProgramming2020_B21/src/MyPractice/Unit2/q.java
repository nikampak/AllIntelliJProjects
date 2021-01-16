package MyPractice.Unit2;

public class q {
    public static void main(String[] args) {
        String word = "   Winter is coming";
        word = word.trim ();
        System.out.println(word.length());
        System.out.println("================");
        String a = "123";
        String b = 5+4+ a;
        System.out.println(b);
        System.out.println("================");

        String s = "Java is fun";
        int c = s.charAt(4);

        if (c == 'a') {
            System.out.println('A');
        }else if (c == ' ') {
            System.out.println('B');
        }else{
            System.out.println('C');
        }
        System.out.println("================");
        String result = 3425 > (9*1000) ? "garden" : "patio";
        result.substring(2);
        System.out.println(result);
        System.out.println("================");

        String str = "the fox ran under the bridge";

        str = str.substring(4, 17);
        str.toUpperCase();
        System.out.println(str + "ground");


    }
}
