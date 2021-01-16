/* package day13_SwitchStatement;

public class Browsers_1 {
    public static void main(String[] args) {
        String browserName = "chrome";
        String selectedBrowser = "";

   /*     switch (browserName) {
            case "chrome":
                selectedBrowser = "CHROME BROWSER";
                break;
            case "firefox":
                selectedBrowser = "FIREFOX BROWSer";
                break;





/*
        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";
        String selectedBrowser = "";

        if (valid) {
            if (browserName == "chrome") {
                selectedBrowser = "CHROME BROWSER IS SELECTED"; // No variable
            } else if (browserName == "firefox") {
                selectedBrowser = "FIREFOX BROWSER IS SELECTED";
            } else if (browserName == "opera") {
                selectedBrowser = "OPERA BROWSER IS SELECTED";
            } else if (browserName == "safari") {
                selectedBrowser = "SAFARI BROWSER";
            } else if (browserName == "edge") {
                selectedBrowser = "EDGE BROWSER";
            } else {
                selectedBrowser = "INTERNET EXPLORE";
            }

        } else {
            System.out.println("no such browser");
        }
        System.out.println(browserName);


/*
        if(valid){
            if (browserName == "chrome") {
                System.out.println("CHROME BROWSER IS SELECTED"); // No variable
            } else if (browserName == "firefox") {
                System.out.println("FIREFOX BROWSER IS SELECTED");
            } else if (browserName == "opera"){
                System.out.println("OPERA BROWSER IS SELECTED");

/*
2. write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
 */