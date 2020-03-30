package Turn;

import Card.Card;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class TurnTest {
    @Test
    void testTurnAndAttributesExists() {
        //given
        final Turn turn1 = new Turn();
        final Card card1 = new Card();

        //when
        turn1.card = card1;
        turn1.guess = "Juneau?";
        card1.question = "What is the capital of Alaska?";
        card1.answer = "Juneau?";
        card1.category = "Geography";

        //then

        assertNotNull(turn1);
        assertEquals("Juneau?", turn1.guess);
        assertNotEquals("Devner?", turn1.guess);
        assertTrue(turn1.correct());
        assertEquals("Correct!", turn1.feedback());
    }

    @Test
    void testTurnCanBeIncorrect() {
        //given
        final Turn turn2 = new Turn();
        final Card card2 = new Card();

        //when
        card2.question = "What is the capital of Louisiana?";
        card2.answer = "Baton Rouge?";
        card2.category = "Geography";
        turn2.card = card2;
        turn2.guess = "New Orleans?";


        //then
        assertNotEquals("Correct!", turn2.feedback());
        assertFalse(turn2.correct());
        assertEquals("Incorrect.", turn2.feedback());
    }
}