package section04.method_overloading;

public class Main {

    public static void main(String[] args) {
        printScore("Pesho", 500);
        printScore(1000);
    }

    public static void printScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
    }

    public static void printScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
    }


}
