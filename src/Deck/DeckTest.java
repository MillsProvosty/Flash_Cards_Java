package Deck;

import Card.Card;
import Turn.Turn;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTest {
    @Test
    void testDeckExists() {
        //given
        final Card card1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
        final Card card2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
        final Card card3 = new Card("Describe in words the exact direction that is 697.5° clockwise from due north?", "North north west", "STEM");
        final Deck deck1 = new Deck(card1, card2, card3);


        //when


        //then
    }
}
