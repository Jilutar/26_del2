import java.util.Scanner;
public class fieldgame {
 
    private double player1Score;
    private double player2Score;
 

    public fieldgame() { //initiating the game with 1000 points for both players
        player1Score = Konto.gameReset();
        player2Score = Konto.gameReset();
    }
 
   
    //code for when the game starts 
    public void playRound() {
        while (player1Score < 3000 && player2Score < 3000) {
            System.out.println("Play game? y/n");

            Playerresponse.PlayerResponse();
            double player1Roll = Dice.rollDice();

            
            double player2Roll = Dice.rollDice();
 

            if(player1Roll==2) {
                player1Score += 250;
                System.out.println("player 1 rolled a 2 and 250 points will therefore be added to their pointbank");
            }
            
            if(player2Roll==2) {
                player2Score += 250; 
                System.out.println("player 2 rolled a 2 and 250 points will therefore be added to their pointbank");
            }

            if (player1Roll == 3) {
                player1Score -= 100;
                System.out.println("player 1 rolled a 3 and 100 points will be taken from to their pointbank");
            }

            if (player2Roll == 3) {
                player2Score -= 100;
                System.out.println("player 2 rolled a 3 and 100 points will be taken from to their pointbank");
            }

            if (player2Roll == 4) {
                player2Score += 100;
                System.out.println("player 2 rolled a 4 and 100 points will therefore be added to their pointbank");
            }
 
            if (player1Roll == 4) {
                player1Score += 100;
                System.out.println("player 1 rolled a 4 and 100 points will therefore be added to their pointbank");
            }

            if (player2Roll == 4) {
                player2Score += 100;
                System.out.println("player 2 rolled a 4 and 100 points will therefore be added to their pointbank");
            }

            if (player1Roll == 5) {
                player1Score -= 20;
                System.out.println("player 1 rolled a 5 and 20 points will therefore be taken to their pointbank");
            }
            
            if (player2Roll == 5) {
                player2Score -= 20;
                System.out.println("player 2 rolled a 5 and 20 points will therefore be taken to their pointbank");
            }

            if (player1Roll == 6) {
                player1Score += 180;
                System.out.println("player 1 rolled a 6 and 180 points will therefore be added to their pointbank");
            }
            
            if (player2Roll == 6) {
                player2Score += 180;
                System.out.println("player 2 rolled a 6 and 180 points will therefore be added to their pointbank");
            }

            if (player1Roll == 7) {
                System.out.println("player 1 rolled a 7. Nothing will happen");
            }
            
            if (player2Roll == 7) {
                System.out.println("player 2 rolled a 7. Nothing will happen");
            }

            if (player1Roll == 8) {
                player1Score -= 70;
                System.out.println("player 1 rolled a 6 and 70 points will therefore be removed to their pointbank");
            }
            
            if (player2Roll == 8) {
                player2Score -= 70;
                System.out.println("player 2 rolled an 8 and 70 points will therefore be removed to their pointbank");
            }

            if (player1Roll == 9) {
                player1Score += 60;
                System.out.println("player 1 rolled a 9 and 60 points will therefore be added to their pointbank");
            }
            
            if (player2Roll == 9) {
                player2Score += 60;
                System.out.println("player 2 rolled a 9 and 60 points will therefore be added to their pointbank");
            }

            if (player1Roll == 10) {
                player1Score -= 80;
                System.out.println("player 1 rolled a 10 and 80 points will therefore be removed to their pointbank");
            }
            
            if (player2Roll == 10) {
                player2Score -= 80;
                System.out.println("player 2 rolled a 10 and 80 points will therefore be removed to their pointbank");
            }

            if (player1Roll == 11) {
                player1Score -= 50;
                System.out.println("player 1 rolled a 11 and 50 points will therefore be removed to their pointbank");
            }
            
            if (player2Roll == 11) {
                player2Score -= 50;
                System.out.println("player 2 rolled a 11 and 180 points will therefore be removed to their pointbank");
            }

            if (player1Roll == 12) {
                player1Score += 650;
                System.out.println("player 1 rolled a 12 and hit a goldmine!! :D. 650 points will therefore be added to their pointbank");
            }
            
            if (player2Roll == 12) {
                player2Score += 650;
                System.out.println("player 2 rolled a 12 and hit a goldmine!! :D. 650 points will therefore be added to their pointbank");
            }
            //if statements for all 2-12 fields that are possible to hit for both players
            
            System.out.println("");
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);
            System.out.println("---------------------"); //print out the overall score and a bracket 
            
            if (player1Score < 1) {
                player1Score = 0;
            }

            if (player2Score < 1) {
                player2Score = 0;
            }
            //Makes sure that the players balance cannot go below 0 points
        }
 
        if (player1Score >= 3000) {
            System.out.println("Player 1 wins!");
        } 
        else {
            System.out.println("Player 2 wins!");
        }
        //print out who won when one player has more than 3000 points
    
    }

 
    public static void main(String[] args) {
        fieldgame game = new fieldgame();
        game.playRound();

    }
}
