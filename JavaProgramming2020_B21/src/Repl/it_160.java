package Repl;

public class it_160 {
    public static void main(String[] args) {
        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
// find unique String in Array
        for (String each : words) {
            int count = 0;
            for (String word : words) {
                if (each.equals(word)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each); // java , python
            }
        }
    }
}
