package Card;

import Card.Card;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void testCardAndAttributesExists() {
        //given
       final Card card1 = new Card();

       //when
        card1.question = "What is the capital of Alaska?";
        card1.answer = "Juneau?";
        card1.category = "Geography";

        //then

        assertNotNull(card1);
        assertEquals("What is the capital of Alaska?", card1.question);
        assertEquals("Juneau?", card1.answer);
        assertEquals("Geography", card1.category);
        assertNotEquals("Math", card1.category);
    }


}
