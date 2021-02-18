package s06_oop_part1_classes_constructors_inheritance.inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking...");
        move(5);
    }

    public void run() {
        System.out.println("Dog is running");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving...");
        super.move(speed);
    }
}
