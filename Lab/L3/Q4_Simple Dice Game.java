import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        /*
        Write a simple two players dice game. 
        Each player will roll the dice twice and the player with the highest score wins the game.
        */
        int dice1, dice2;
        int max = 6;
        int score1 = 0;
        int score2 = 0;
        Random r = new Random();
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Round "+(i+1));
            dice1 = r.nextInt(max)+1;
            System.out.printf("P1 : %d\n",dice1);
            score1 = score1 + dice1;
            dice2 = r.nextInt(max)+1;
            System.out.printf("P2 : %d\n",dice2);
            score2 = score2 + dice2;
            System.out.println();
        }
        
        System.out.println("Player 1: " +score1);
        System.out.println("Player 2: " +score2);
        System.out.println();
        if (score1 > score2) {
            System.out.println("Player 1 wins!!");
        } else if (score2 > score1){
            System.out.println("Player 2 wins!!");
        } else {
            System.out.println("Tie.");
        }
    }
    
}
