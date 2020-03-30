package Turn;

import Card.Card;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class TurnTest {
    @Test
    void testTurnAndAttributesExists() {
        //given
        final Card card1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
        final Turn turn1 = new Turn("Juneau", card1);


        //then

        assertNotNull(turn1);
        assertEquals("Juneau", turn1.guess);
        assertNotEquals("Mars", turn1.guess);
        assertTrue(turn1.correct());
        assertEquals("Correct!", turn1.feedback());
    }

    @Test
    void testTurnCanBeIncorrect() {
        //given
        final Card card2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
        final Turn turn2 = new Turn("Venus", card2);


        //when


        //then
        assertNotEquals("Correct!", turn2.feedback());
        assertFalse(turn2.correct());
        assertEquals("Incorrect.", turn2.feedback());
    }
}