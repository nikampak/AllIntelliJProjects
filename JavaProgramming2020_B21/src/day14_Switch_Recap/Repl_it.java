package day14_Switch_Recap;

public class Repl_it {
    public static void main(String[] args) {
   /*     int n1 = 2;
        int n2 = 7;
        int n3 = 8;

        String result = "";

        if(n1>n2 && n1>n3){
            result = "n1 is bigger";
        }else if(n2>n1 && n2>n3){
            result = "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }
        System.out.println(result);

    */
        /*
        double version = 2.1;
        String result = "";

        if(version == 1.5){
            result = "Cupcake";
        }else if(version == 1.6){
            result = "Donut";
        }else if(version == 2.1){
            result = "Eclair";
        }else if(version == 2.2){
            result = "Froyo";
        }else if(version == 2.3){
            result = "Gingerbread";
        }else if(version == 3.1){
            result = "Honeycomb";
        }else if(version == 4.0){
            result = "Ice Cream Sandwich";
        }else if(version >= 4.1 && version <= 4.31){
            result = "Jelly Bean";
        }else if(version >= 4.4 && version <= 4.44){
            result = "KitKat";
        }else if(version >= 5.0 && version <= 5.11){
            result = "Lollipop";
        }else if(version >= 8.0 && version <= 8.1){
            result = "Oreo";
        }else if(version == 9.0){
            result = "Pie";
        }else{
            result = "Sorry, I don't know this version!";
        }
        System.out.println(result);
 */
        /*
        int numberOfBedrooms = 2;
        String result = "";

        if(numberOfBedrooms == 1){
            result = "One Bedroom Selected \nStarting Price: 1100";
        }else if(numberOfBedrooms == 2){
            result = "Two Bedroom Selected \nStarting Price: 1850";
        }else if(numberOfBedrooms == 3){
            result = "Three Bedroom Selected \nStarting Price: 2550";
        }else{
            result = "No such Bedrooms available";
        }
        System.out.println(result);

*/
        /*
        int x = -4;
        int result = ( x >= 5 )? x : x;
        System.out.println(result);

        int num = -102;

        if(num > 0){
            System.out.println(num + " is positive");
        }else if(num < 0){
            System.out.println(num + " is negative");
        }else{
            System.out.println("Invalid");
        }

         */
        int num = 36;

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        int status = 200;

        String output = "";
        switch(status){
            case 200:
                output = "OK";
                break;
            case 201:
                output = "Created";
                break;
            case 202:
                output = "Accepted";
                break;
            case 301:
                output = "Moved Permanently";
                break;
            case 303:
                output = "See Other";
                break;
            case 304:
                output = "Not Modified";
                break;
            case 307:
                output = "Temporary Redirect";
                break;
            case 400:
                output = "Bad Request";
                break;
            case 401:
                output = "Unauthorized";
                break;
            case 403:
                output = "Forbidden";
                break;
            case 404:
                output = "Not Found";
                break;
            case 410:
                output = "Gone";
                break;
            case 500:
                output = "Internal Server Error";
                break;
            case 503:
                output = "Service Unavailable";
                break;
            default:
                output = "Invalid status code!";
                break;
        }
        System.out.println(output);

        int bill = 2400;
        int discount = (bill > 200) ? 15 : 10;

    }
}