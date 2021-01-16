package Repl;

public class it_168 {
    public static void main(String[] args) {
            double bill = 0.0;
            double units = 50;

            //your code here
            if(units < 50){
                bill = units*0.60;
            }else if(units < 100){
                bill = units*0.90;
            }else if(units < 150){
                bill = units*0.90+50;
            }else{
                bill = units*0.90+100;
            }



            //end your code here


        System.out.println(bill);;
        }//end waterTax


    }
