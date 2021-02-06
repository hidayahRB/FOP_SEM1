package lab4;

import java.util.Random;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // Simple Two Players Dice Game
        // Each player will take turns to roll a dice. 
        // The first players that reach more than 100 points win the game. 
        // If the player rolls a 6, the player will score 6 points and has the chance to roll again.
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String game = "play";
        
        
        while(game.equalsIgnoreCase("play")){
            int dice1, dice2;
            int max = 6;
            int score1 = 0;
            int score2 = 0;
            
            for (int i = 0; (score1 < 100) || (score2 < 100); i++) {
                System.out.println("Round "+(i+1));
                dice1 = r.nextInt(max)+1;
                System.out.printf("P1 : %d\n",dice1);
                score1 = score1 + dice1;
                // if player1 gets 6, roll dice again before next player
                while (dice1 == 6) {
                    dice1 = r.nextInt(max)+1;
                    score1 = score1 + dice1;
                    System.out.println("P1 (Extra move) : " + dice1);
                }
                dice2 = r.nextInt(max)+1;
                System.out.printf("P2 : %d\n",dice2);
                score2 = score2 + dice2;
                // if player2 gets 6, roll dice again before next player
                while (dice2 == 6) {
                    dice2 = r.nextInt(max)+1;
                    score2 = score1 + dice2;
                    System.out.println("P2 (Extra move) : " + dice2);
                }
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
            System.out.print("Type play/quit this game : ");
            game = s.nextLine();
        }
        
    }
    
}
