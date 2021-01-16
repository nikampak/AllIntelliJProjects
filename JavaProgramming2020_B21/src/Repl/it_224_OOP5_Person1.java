package Repl;

public class it_224_OOP5_Person1 {

    String firstName, lastName;
    int age;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return firstName+" | " + lastName +" | " + age;
    }

    public it_224_OOP5_Person1(){
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }

    public it_224_OOP5_Person1(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
