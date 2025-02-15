import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiceTest {

    @Test
    void testRollDie() {
        Dice roller = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = roller.rollDie();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

    @Test
    void testRollDice() {
        Dice roller = new Dice();
        for (int i = 0; i < 100; i++) {
            int die1 = roller.rollDie();
            int die2 = roller.rollDie();
            assertTrue(die1 >= 1 && die1 <= 6);
            assertTrue(die2 >= 1 && die2 <= 6);
        }
    }

    @Test
    void testCountRollsUntilDouble() {
        Dice roller = new Dice();
        int rolls = roller.countRollsUntilDouble();
        assertTrue(rolls >= 1, "It should take at least one roll to get a double");
    }
}
