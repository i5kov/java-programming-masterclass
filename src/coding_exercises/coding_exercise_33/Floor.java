package coding_exercises.coding_exercise_33;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width > 0) {
            this.width = width;
        }
        if (length > 0) {
            this.length = length;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }

}
