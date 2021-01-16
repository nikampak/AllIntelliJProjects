package day44_Inheritance.WebDriverTask;

public class OperaDriver extends WebDriver{

    public OperaDriver(){
        super("Opera Browser", "75.12.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL +" from opera driver");
    }

    @Override
    public void close() {
        System.out.println("Closing opera driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing opera driver");
    }
}
