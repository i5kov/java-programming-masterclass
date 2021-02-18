package coding_exercises.coding_exercise_33;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}
