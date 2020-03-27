package Card;

import Card.Card;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertNotNull;

class CardTest {
    @Test
    void testCardExists() {
       final Card card1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");

        assertNotNull(card1);
    }
}
