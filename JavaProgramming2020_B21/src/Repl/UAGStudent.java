package Repl;

public class UAGStudent {

    public String name, studentID;
    public int grade;
    public static String principalName;
    public static int nextID;

    static {
        principalName = "Ms. McKoy";
        nextID = 100;
    }

    public UAGStudent (String name, int grade){
        this.name = name;
        this.grade = grade;
        studentID = name.substring(0, 1).toUpperCase() + nextID;
        nextID++;
    }
    public static void newPrincipal(String name){
        principalName = name;
    }
    public static void resetID (){
        nextID = 100;
    }
    public String toString (){
        return name + " " + studentID;
    }
}
