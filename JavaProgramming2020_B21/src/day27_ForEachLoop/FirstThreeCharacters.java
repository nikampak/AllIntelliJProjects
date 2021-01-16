package day27_ForEachLoop;

public class FirstThreeCharacters {
    public static void main(String[] args) {
        String [] names =  {"Evan", "Katrin", "Anna", "Lola", "Oleg", "Annabel", "Elvin", "Ilgar", "Nadine", "Bob"} ;
        for( String eachName : names ){
            System.out.println( eachName.substring(0, 3 ) );
        }

    }
}
