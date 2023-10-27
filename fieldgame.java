import java.util.Random;
 

public class fieldgame {
 
    private int player1Score;
    private int player2Score;
    private Random random;
 

    public fieldgame() { //initiating the game with 1000 points for both players
        player1Score = 1000;
        player2Score = 1000;
        random = new Random();
    }
 
    private int rollDice() {
        int dice1 = random.nextInt(6)+1; 
        int dice2 = random.nextInt(6)+1;
        int dicecurrent = dice1+dice2; 
        return dicecurrent; //prints out the dicecurrent that is two dices together
    }
 
    //code for when the game starts 
    public void playRound() {
        while (player1Score < 3000 && player2Score < 3000) {
            int player1Roll = rollDice();
            int player2Roll = rollDice();
 

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
