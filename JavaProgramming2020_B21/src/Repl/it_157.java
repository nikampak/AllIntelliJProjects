package Repl;

public class it_157 {
    public static void main(String[] args) {
        String s = "07:15:55AM";
        int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));

        if(s.endsWith("AM")) {
            s = s.replace("AM", "");
            if (hour == 12) {
                System.out.println("00" + s.substring(2));
            }else{
                System.out.println(s);
            }
        }else if(s.endsWith("PM")){
            s = s.replace("PM", "");
            if (hour == 12){
                System.out.println("12"+s.substring(2));
            }else {
                hour += 12;
                System.out.println(hour + s.substring(s.indexOf(":")));
            }
        }
    }
}
