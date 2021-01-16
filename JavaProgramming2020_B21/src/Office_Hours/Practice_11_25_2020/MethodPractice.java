package Office_Hours.Practice_11_25_2020;

public class MethodPractice {
    public static void main(String[] args) {
        divisibleBy3Between1To100();
        System.out.println();
        System.out.println("Hello");
        divisibleBy3Between1To100();
        System.out.println();
        System.out.println("How are you");

        divisibleBy3Between1To100(50, 50);
        System.out.println("Test");

        grade(90);

        eligibleToVote(11, true);

    }

    public static void divisibleBy3Between1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) { // if the number is not divisible by 3
                continue;    // then skip
            }
            System.out.print(i + " ");
        }
    }

    public static void divisibleBy3Between1To100(int start, int end) {
        if (end <= start) {
            return;         // exits the current method
        }
        for (int i = start; i <= end; i++) {
            if (i % 3 != 0) { // if the number is not divisible by 3
                continue;    // then skip
            }
            System.out.print(i + " ");
        }
    }

    /*
    A: Excellent
    B: Great
    C: Good
    D: Passed
    F: Failed
     */
    public static void grade(int score) {
        if (score > 100 || score < 0) {     //if score is invalid
            System.err.println("Invalid");
            return;
        }
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");

        }
    }
    public static void eligibleToVote (int age, boolean isUSCitizen){
        if (age < 18) {
            System.out.println("You must be at least 18 years old");
            return;
        }
        if (isUSCitizen == false) {
            System.out.println("You must be a US citizen to vote");
            return;
        }
        System.out.println("You are eligible to vote");
    }
}
