package Repl;

public class Pizza {

    private String size;
    private int numberOfCheese, numberOfPepperoni, numberOfHam;

    public Pizza(String size, int numberOfCheese, int numberOfPepperoni, int numberOfHam) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
        this.numberOfHam = numberOfHam;
    }

    public String getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public int getNumberOfCheese() {
        return numberOfCheese;
    }

    public void setNumberOfCheese(int numberOfCheese) {
        this.numberOfCheese = numberOfCheese;
    }

    public int getNumberOfPepperoni() {
        return numberOfPepperoni;
    }

    public void setNumberOfPepperoni(int numberOfPepperoni) {
        this.numberOfPepperoni = numberOfPepperoni;
    }

    public int getNumberOfHam() {
        return numberOfHam;
    }

    public void setNumberOfHam(int numberOfHam) {
        this.numberOfHam = numberOfHam;
    }

    public double calcCost() {
        int totalCost = 0;
        if (size.equalsIgnoreCase("small")) {
            totalCost = 10 + (2 * numberOfCheese) + (2 * numberOfPepperoni) + (2 * numberOfHam);
        } else if (size.equalsIgnoreCase("medium")) {
            totalCost = 12 + (2 * numberOfCheese) + (2 * numberOfPepperoni) + (2 * numberOfHam);
        } else if (size.equalsIgnoreCase("large")) {
            totalCost = 14 + (2 * numberOfCheese) + (2 * numberOfPepperoni) + (2 * numberOfHam);
        }
        return totalCost;
    }
    public String getDescription(){
        return size + " Pizza with " +numberOfCheese + " Cheese toppings, " + numberOfPepperoni + " Pepperoni toppings, and " + numberOfHam + " Ham toppings." + "\nTotal Price: " + calcCost();
    }
}
/*
Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large), the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */




























