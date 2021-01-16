package day07_UnaryOperators;

public class PostPre {
    public static void main(String[] args) {
        int x = 2;
        int y = x++; // post increment: first passes current value 2

        System.out.println(x);
        System.out.println(y);

        System.out.println("===============");
        int x2 =2;
        System.out.println(++x2); // 3
        System.out.println(x2); //3

        System.out.println("----------------");

        int x4 = 8;
        int y4 = x4--; // y4=8
        System.out.println(y4); // 8
        System.out.println(x4); // 7
        System.out.println("-------------------");

        int a = 1; // a= 0
        int b = -a-- + a++ / -a-- * --a;
        //  b = - 1 +   0  / -1   *  -1
        //  b = -1
        System.out.println(b);

        System.out.println("=================]");

        int A = 50; // A = 50
        int B = --A + A++ + A-- + A++;
        //  B =  49  + 49 + 50 + 49
        //  49 (50-1=49) + 49 (49 CV --> next CV 49+1=50) + 50 (50 CV --> next CV 50-1=49) + 49 (49 CV --> next CV 49+1=50)
        //  B = 197
        System.out.println(B);

        System.out.println("=====================");
        int X = 4;
        int Y = X * 4 - X++;
        //  Y = 4 * 4 - 4
        //  Y =  16   - 4
        //  Y = 12
        System.out.println(Y);

        System.out.println("=====================");
        int t = 100; // t= 101
        int p = - ++t * -t-- / t++ + --t;
        //  p = - 101 * -101 / 100 + 100
        //  - 101 (new current value) * -101 (101, Current number) / 100 (101-1 Passing current value) + 100 (101-1, decrease Current value )
        //  p = 100

        System.out.println(t);

        System.out.println("========================");
        int R = 20;  //W= 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W = -20  + -19  + 19 * 19 % 2
        //  W = -20 (20 CV --> next CV is 20-1=19) + -19 (19 CV --> next CV is 19+1=20) + 19 (20-1=19 CV --> next CV 19)  * 19 (19 CV, next CV --> 18) % 2
        //  W = -20  + -19  +[19  * 19 % 2]
        //  W = -20  + -19  +[361 % 2]
        //  W = -20  + -19  + 1
        //  W = -38

        System.out.println(W);
        System.out.println("+=++++++++++++++++++++");
        int M = 300; // 300
        int N = 400; // 401

        int U = ++M + N++ - M-- % 2 + --N % 2;
        //  U = 301 + 400 - 301 % 2 + 400 % 2
        //  U = 301 + 400 -[301 % 2] +[400 % 2]
        //  U = 301 + 400 -    [1] +    [0]
        //  U = 301 + 400 -    1
        //  U = 700
        System.out.println(U);

        int J = M + N - M * N + M / N;






    }
}
