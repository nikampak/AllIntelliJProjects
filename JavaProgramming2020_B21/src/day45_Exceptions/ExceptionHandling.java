package day45_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {
        //StringIndexOutOfBounds

        String str = "Cybertek";

    try {
        System.out.println(str.substring(200, 300));
    }catch (StringIndexOutOfBoundsException e){
        System.out.println( e.getMessage());//begin 200, end 300, length 8
//        e.printStackTrace();//report about the Exception after the code execution
        //java.lang.StringIndexOutOfBoundsException: begin 200, end 300, length 8
        //	at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3720)
        //	at java.base/java.lang.String.substring(String.java:1909)
        //	at day45_Exceptions.ExceptionHandling.main(ExceptionHandling.java:11)
    }

        System.out.println("Test completed");//Test completed

        
    }
}
