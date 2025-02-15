import java.util.Random;

public class Dice {
    private final Random random;

    public Dice() {
        this.random = new Random();
    }

    public int rollDie() {
        return random.nextInt(6) + 1;
    }

    public boolean rollDice() {
        int die1 = rollDie();
        int die2 = rollDie();
        System.out.println("Rolled: " + die1 + " and " + die2);
        if (die1 == die2) {
            System.out.println("You rolled a double!");
            return true;
        } else {
            System.out.println("Try again.");
            return false;
        }
    }

    public int countRollsUntilDouble() {
        int count = 0;
        while (!rollDice()) {
            count++;
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Dice roller = new Dice();
        int rolls = roller.countRollsUntilDouble();
        System.out.println("It took " + rolls + " rolls to get a double.");
    }
}
