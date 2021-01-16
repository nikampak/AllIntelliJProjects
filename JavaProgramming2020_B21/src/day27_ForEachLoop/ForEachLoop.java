package day27_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for(int i = 0; i <= names.length-1; i++ ){  // i is the index num of array
            System.out.println( names[i] );
        }

        System.out.println("=====================================");

        for(String   each  : names ){  // each is the element
            System.out.print(each);     // DelaramAyselSnoopAyseErjon
        }
        System.out.println();
        System.out.println("=========================================");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};

        int countEvens = 0;
        int countOdds =0;

        for(int  each  : numbers){ // each is the elements of the array
            if(each % 2 == 0){
                countEvens++;
            }else{
                countOdds++;
            }
        }

        System.out.println("count Odds = " + countOdds); //count Odds = 6
        System.out.println("count Evens = " + countEvens); // count Evens = 6

        System.out.println("=======================================================");
        int[] scores = {10, 2, 3, 25, 5, 100, -5, -2, 1000, 30, 40, 56};
        int max = scores[0] ;
        int min = scores[0];

        for(int each  : scores){
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }
        }

        System.out.println("max = " + max); //1000
        System.out.println("min = " + min); // -5
    }
}
