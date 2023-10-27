public class Dice {
    static double dice1;
    static double dice2;
    static double diceSum;

    static double rollDice() {
        dice1 = Math.floor(Math.random() * (6 - 1 + 1) + 1);
        dice2 = Math.floor(Math.random() * (6 - 1 + 1) + 1);
        diceSum = dice1 + dice2;
        return diceSum;
    }
}
