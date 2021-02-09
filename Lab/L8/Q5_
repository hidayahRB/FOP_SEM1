package lab8;

public class Q5 {

    public static void main(String[] args) {
        // Define a class Game. The class has a constructor that accept player name. 
        // Besides, the class contains a method move that roll the dice. 
        // A Tester class to test the program with two players and the player that reach 100 or more win the game.
        
        Game a = new Game("Riftan","Maxi");
        a.diceGame();
    }
    
}

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String p1,p2;
    
    // constructor
    public Game(String p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void diceGame(){
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
                System.out.println("----------");
                // player 1
                dice1 = r.nextInt(max)+1;
                System.out.printf(p1+" : %d\n",dice1);
                score1 = score1 + dice1;
                // player 2
                dice2 = r.nextInt(max)+1;
                System.out.printf(p2+" : %d\n",dice2);
                score2 = score2 + dice2;
                
                System.out.println();
            }
            System.out.println(p1+" : " +score1);
            System.out.println(p2+" : " +score2);
            System.out.println();
            
            if (score1 > score2) {
                System.out.println(p1+" wins!!");
            } else if (score2 > score1){
                System.out.println(p2+" wins!!");
            } else {
                System.out.println("Tie.");
            }
            System.out.print("Type play/quit this game : ");
            game = s.nextLine();
        }
    }
       
}
