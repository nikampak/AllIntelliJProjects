package Office_Hours.Practice_11_04_2020;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaaabbbbcccdd";
        String result = "";

        char ch = str.charAt(0);  // represents characters. also can be used char ch = 'a';
        int count = 0;      // represents frequency
        for (int i = 0; i < str.length(); i++) { // ot find the frequency of one character by comparing
            // it with the string
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        result += ""+ch + count;
        System.out.println(result);

    }
}
