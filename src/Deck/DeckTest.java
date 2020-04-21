package Deck;

import Card.Card;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class DeckTest {
    @Test
    void testDeckExists() {
        //given
        final Card card1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
        final Card card2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
        final Card card3 = new Card("Describe in words the exact direction that is 697.5° clockwise from due north?", "North north west", "STEM");
        final List<Card> cards1 = new ArrayList<Card>();

        //when
        cards1.add(card1);
        cards1.add(card2);
        cards1.add(card3);
        final Deck deck1 = new Deck(cards1);

        //then
        assertEquals(deck1.countCards(), 3);
        assertFalse(deck1.cardsInCategory("Geography").contains(card2));
        assertFalse(deck1.cardsInCategory("Geography").contains(card3));
        assertTrue(deck1.cardsInCategory("Geography").contains(card1));
    }
}
