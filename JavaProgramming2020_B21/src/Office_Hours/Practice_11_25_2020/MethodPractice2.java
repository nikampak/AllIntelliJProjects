package Office_Hours.Practice_11_25_2020;

public class MethodPractice2 {
    public static void main(String[] args) {
        max(100, 200);
        System.out.println(max(100, 200) * 2);

        System.out.println(max(100, 200, 600));
        System.out.println(max(1000, 2000, 30 ,40));



    }

    public static int max( int a, int b){
        int maximum = (a > b) ? a : b;
        return maximum;
    }
    public static int max( int a, int b, int c){
//        option 1:
//        int n = max(a, b);
//        return max(n, c);

//        option 2:
        return max( max(a, b), c);
    }
    public static int max( int a, int b, int c, int d){
        return max(max(a,b,c), d);
    }
}
