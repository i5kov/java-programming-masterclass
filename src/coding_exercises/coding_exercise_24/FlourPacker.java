package coding_exercises.coding_exercise_24;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    /**
     * @param bigCount   represents the count of big flour bags (5 kilos each)
     * @param smallCount represents the count of small flour bags (1 kilo each)
     * @param goal       represents the goal amount of kilos of flour needed to assemble a package
     * @return
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int fives = goal / 5;
        int remaining = goal % 5;
        if (fives <= bigCount) {
            if (remaining <= smallCount) {
                return true;
            }
        }
        return (goal - (bigCount * 5 + smallCount) <= 0);
    }
}
