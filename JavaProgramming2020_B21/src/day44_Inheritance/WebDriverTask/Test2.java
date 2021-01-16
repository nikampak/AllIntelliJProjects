package day44_Inheritance.WebDriverTask;

public class Test2 {
    public static void main(String[] args) {
        OperaDriver driver = new OperaDriver();

        driver.get("Amazon.com");

        driver.maximize();

        driver.close();
    }



}
