package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {
    public static void main(String[] args)  {
        try{
            System.out.println( 25/ 0 );
        }catch (NoSuchElementException e){
            System.out.println("No Such Element Exception");
        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }


        System.out.println("-----------------");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String [] names = {"Walid", "Agalar", "Ayjeren"};

        try {
            names[10] = "Muhtar";
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument Exception");
        }catch (NoSuchElementException e) {
            System.out.println("No Such Element Exception");
        }catch (ArrayIndexOutOfBoundsException e) { // child comes first
            System.out.println("Array Index Out Of Bounds Exception");
        }catch (StringIndexOutOfBoundsException e){ // parent
            System.out.println("String Index Out OfBoundsException");
        }catch (RuntimeException e){                // grandparent
            System.out.println("Runtime Exception");
        }//to use Multi Catch block you MUST follow the parent-child structure

        System.out.println("-------------------------");



    }
}
