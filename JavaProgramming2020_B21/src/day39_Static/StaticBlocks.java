package day39_Static;

import day37_CustomClass.Employee;

public class StaticBlocks {

    public static String company;
    public static Employee employee1;
    public static int b;
    public static boolean isEmployeed;

    public int a;

    //xcelSheet

    static{
        company = "Capital One";
        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("john", company, "SDET", "A123", "Male", 40, 55);
        //
        // a = 100;
        b = 200;

    }



}
