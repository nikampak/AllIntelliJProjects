package day48_Abstraction.AnimalTask;

public final class Dolphin extends Animal implements Swimmable, Playable{

    public Dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps 8 hours");
    }

    @Override
    public void play() {
        System.out.println("Dolphin plays with human");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin can swim for 8 hours");
    }
}
