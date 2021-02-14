package section04.methods_challenge;

public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ivan", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Pesho", highScorePosition);

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Gosho", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Dani", highScorePosition);
    }

    static void displayHighScorePosition(String playerName, int positionInTable) {
        System.out.println(playerName + " managed to get into position " + positionInTable + " on the high score table");
    }

    static int calculateHighScorePosition(int playerScore) {
        int highScorePosition = 4;
        if (playerScore >= 1000) {
            highScorePosition = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            highScorePosition = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            highScorePosition = 3;
        }
        return highScorePosition;
    }
}
