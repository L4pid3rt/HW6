package Animals;

import java.util.Random;

public class Dog extends Animal {
    static int dogCount;
    Random random = new Random();

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.runDistance = 200 + random.nextInt(200);
        this.jumpHeight = 1 + random.nextInt(3);
        this.swimDistance = 8 + random.nextInt(5);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
