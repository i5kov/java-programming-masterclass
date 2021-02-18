package s06_oop_part1_classes_constructors_inheritance.classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        if (model.equalsIgnoreCase("cayenne") || model.equalsIgnoreCase("accord")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
