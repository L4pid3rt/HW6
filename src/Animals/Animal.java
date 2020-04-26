package Animals;

public class Animal {
    static int animalsCount = 0;
    String name;
    String color;
    int age;
    int runDistance;
    int swimDistance;
    int jumpHeight;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        animalsCount++;
    }

    public void run(int distance) {
        if (distance <= this.runDistance) {
            System.out.println(this.name + " runs " + distance + " meters.");
        } else {
            System.out.println(this.name + " can run only " + this.runDistance + " meters.");
        }
    }

    public void swim(int distance) {
        if (distance <= this.swimDistance){
            System.out.println(this.name +" swims " + distance + " meters.");
        } else {
            System.out.println(this.name + " can swim only " + this.swimDistance + " meters.");
        }

    }

    public void jump(int height) {
        if (height <= this.jumpHeight) {
            System.out.println(this.name + " jumps " + height + " meters.");
        } else {
            System.out.println(this.name + " can jump only " + this.jumpHeight + " meters.");
        }
    }

    public void info () {
        System.out.printf("Name %s, color %s, age %d\n run distance %d, swim distance %d, jump height %d\n", this.name,
                this.color, this.age, this.runDistance, this.swimDistance, this.jumpHeight);
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }
}
