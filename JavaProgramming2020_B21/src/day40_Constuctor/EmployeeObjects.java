package day40_Constuctor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("Ercan", "Civil");

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
