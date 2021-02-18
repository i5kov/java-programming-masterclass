package s06_oop_part1_classes_constructors_inheritance.classes;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car honda = new Car();

        porsche.setModel("Golf 5");
        honda.setModel("Accord");

        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + honda.getModel());
    }
}
