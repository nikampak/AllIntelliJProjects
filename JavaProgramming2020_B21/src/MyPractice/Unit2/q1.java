package MyPractice.Unit2;

public class q1 {
    public static void main(String[] args) {
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) {
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }
        System.out.println("==============");

        String z = "popcorn";
        z = z.substring(1, 8);

        if (z.equals("opcor")) {
            System.out.println(z.length());
        }else{
            System.out.print(z.replace("o,", "a"));
        }

    }
}
