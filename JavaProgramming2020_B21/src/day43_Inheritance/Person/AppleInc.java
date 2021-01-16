package day43_Inheritance.Person;

public class AppleInc { // AppleInc HAS A Teaster

    public static void main(String[] args) {

        Tester tester1 = new Tester("Necdet",24,'F', 50, "SDET", "A124");
        tester1.eat();
        tester1.sleep();
        System.out.println("Salary: " + tester1.calcSalary());
        tester1.testing();
        System.out.println(tester1);

        Developer developer1 = new Developer("Mini",24,'F', 60, "Senior Developer", "A124");
        developer1.coding();
        System.out.println(developer1);
    }


}
