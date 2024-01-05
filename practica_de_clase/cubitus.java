package practica_de_clase;
import java.util.Arrays;
import java.util.Random;

public class cubitus {
    public void playGame() {
    Random random = new Random();
    int[] player1Dice = new int[5];
    int[] player2Dice = new int[5];
    for (int i = 0; i < 5; i++) {
        player1Dice[i] = random.nextInt(6) + 1;
    }
    for (int i = 0; i < 5; i++) {
        player2Dice[i] = random.nextInt(6) + 1;
    }
    int player1Score = calculateScore(player1Dice);
    int player2Score = calculateScore(player2Dice);
    if (player1Score > player2Score) {
        System.out.println("El jugador 1 gana con una puntuación de " + player1Score);
    } else if (player2Score > player1Score) {
        System.out.println("El jugador 2 gana con una puntuación de " + player2Score);
    } else {
        System.out.println("Empate con una puntuación de " + player1Score);
    }
}

private int calculateScore(int[] dice) {
    Arrays.sort(dice);
    int min = dice[0];
    int max = dice[4];
    int score = 0;

    for (int i = 0; i < 5; i++) {
        if (dice[i] != min && dice[i] != max) {
            score += dice[i];
        }
    }

    return score;
}
}
