package coding_exercises.coding_exercise_08_AreaCalculator;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        double area = -1.0;
        if (radius >= 0) {
            area = Math.PI * radius * radius;
        }
        return area;
    }

    public static double area(double x, double y) {
        double area = -1.0;
        if (x >= 0 && y >= 0) {
            area = x * y;
        }
        return area;
    }
}
