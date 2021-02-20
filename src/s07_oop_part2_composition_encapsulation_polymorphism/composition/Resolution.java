package s07_oop_part2_composition_encapsulation_polymorphism.composition;

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
