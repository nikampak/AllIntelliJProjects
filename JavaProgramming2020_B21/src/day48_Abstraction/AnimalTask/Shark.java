package day48_Abstraction.AnimalTask;

public final class Shark extends Animal implements Swimmable, Predator{
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleeps for 0 hours");
    }

    @Override
    public void swim() {
        System.out.println("Shark swims for 20 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Shark hunt fish");
    }
}
