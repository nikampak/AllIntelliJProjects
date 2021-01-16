package day06_ArithmeticOperators;

public class AboutMySelf {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Daniel";
        String fullName = firstName+" "+lastName;

        String from = "USA";
        String favoriteBook = "Data Structure in Java";
        String favoriteShow = "Game Of Throne";

        System.out.println("Full name is: "+fullName);
        System.out.println("From: "+from);
        System.out.println("Favorite book is: \""+favoriteBook+"\""); // double quote \" must be within the double quotes " "
        System.out.println("Favorite Show is: \"" + favoriteShow + "\"");


    }
}
/*
variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow
    output:
        Full name is: YourFullName
        From: YourCountryName
        Favorite boos is: "YourFavovoriteBook"
        Favorite Show is: "YourFavoriteShow"
 */