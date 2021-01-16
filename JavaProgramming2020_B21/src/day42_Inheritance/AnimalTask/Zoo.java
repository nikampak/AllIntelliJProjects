package day42_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Sher Khan", "bengal tiger", 'M', 5, "orange", "large");

        System.out.println(tiger);
        tiger.eat("Chicken");  // Sher Khan is eating Chicken
        tiger.hunt();               // Sher Khan is hunting
        tiger.roar();               // Sher Khan is roaring

        Cat cat = new Cat("Kitty", "British fold", 'F', 1, "White", "Small");
        System.out.println(cat);
        cat.eat("Tuna");
        cat.drink("milk");
        cat.sleep();
        cat.meow();

        Dog dog = new Dog("Nina", "American bull dog", 'F', 2, "White and brown", "Big");

        System.out.println(dog);
        dog.eat("chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();
    }

}
