package Turn;

import Card.Card;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class TurnTest {
    @Test
    void testCardAndAttributesExists() {
        //given
        final Turn turn1 = new Turn();
        final Card card1 = new Card();

        //when
        turn1.card = card1;
        turn1.answer = "Juneau?";
        card1.question = "What is the capital of Alaska?";
        card1.answer = "Juneau?";
        card1.category = "Geography";

        //then

        assertNotNull(turn1);
    }
}