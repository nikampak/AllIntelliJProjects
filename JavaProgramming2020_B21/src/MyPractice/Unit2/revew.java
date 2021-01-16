package MyPractice.Unit2;

public class revew {
    public static void main(String[] args) {
        String [] strs = {"display", "population", "meeting", "copy", "franchise"};

//        int a = strs.length;
//        int b = strs[5].length();
//        System.out.println(a + " "+ b);
        String str = "cybertek";
        for (int i = 0; i <= str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
