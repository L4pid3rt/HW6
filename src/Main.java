import Animals.Animal;
import Animals.Cat;
import Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Barbos","Red",5);
        Dog dog1 = new Dog("Tuzik", "White", 14);
        Cat cat = new Cat("Murzik","Black", 3);
        Cat cat1 = new Cat("Barsik","Yellow", 3);

        dog.info();
        dog1.info();
        cat.info();
        cat1.info();
        System.out.println();

        dog.run(1000);
        dog1.run(100);
        cat.swim(20);
        dog.swim(5);
        System.out.println();

        System.out.println("Animals created " + Animal.getAnimalsCount());
        System.out.println("Dogs created " + Dog.getDogCount());
        System.out.println("Cats created " + Cat.getCatCount());

    }
}
