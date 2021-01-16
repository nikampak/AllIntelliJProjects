package day44_Inheritance.WebDriverTask;

public class SafariDriver extends WebDriver {

    public SafariDriver() {
        super("Safari Browser", "81.0.13");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL +" from safari driver");
    }

    @Override
    public void close() {
        System.out.println("Closing safari driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing safari driver");
    }
}
