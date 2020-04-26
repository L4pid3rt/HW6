package Animals;

import java.util.Random;

public class Cat extends Animal {
    static int catCount;
    Random random = new Random();

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.runDistance = 50 + random.nextInt(50);
        this.jumpHeight = 5 + random.nextInt(3);
        this.swimDistance = 0;
        catCount++;
    }

    @Override
    public void swim (int distance) {
        System.out.println(this.name + " can't swim " + distance + " meters because cats can't swim any distance");
    }

    public static int getCatCount() {
        return catCount;
    }
}
