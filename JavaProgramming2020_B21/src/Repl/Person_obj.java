package Repl;

public class Person_obj {
    public static void main(String[] args) {

        Person s = new Person("Billy","Bob",10,25,1900,"123-45-6789");

        s.setFirstname("John");
        s.getBirthday();
        s.getFirstname();
    }
}
