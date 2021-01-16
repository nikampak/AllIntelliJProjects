package day43_Inheritance.RestaurantTask;

import day43_Inheritance.Person.Employee;

public class Server extends Employee {
    /*
inherited:
    variables: name, age, gender, hourlyRate, jobTitle, ID
    methods: work, setInfo, setInfo, toString, eat, sleep, calcSalary()
     */

    public Server(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void takeOrder(){
        System.out.println(jobTitle + " "+ name + " is taking order");
    }

    public void cleaningTable(){
        System.out.println(jobTitle + " " + name + " is cleaning table");
    }

}
