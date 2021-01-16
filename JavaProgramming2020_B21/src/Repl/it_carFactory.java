package Repl;

public class it_carFactory {
    public static void main(String[] args) {
        String model = "Extravagant line";
        int year = 2019;
        boolean recalled = false;

        if(model.equals("Extravagant line") && year >=2010 && year<=2012){
            System.out.println(recalled = true);
        }else{
            System.out.println(recalled = false);
        }

    }
}
