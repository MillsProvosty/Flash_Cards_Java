package Round;


import Card.Card;
import Deck.Deck;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundTest {
    @Test
    void testRoundExists(){
        //given
        final Card carda = new Card("What is the capital of Alaska?", "Juneau", "Geography");
        final Card cardb = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
        final Card cardc = new Card("Describe in words the exact direction that is 697.5° clockwise from due north?", "North north west", "STEM");
        final List<Card> cards2 = new ArrayList<Card>();
        cards2.add(carda);
        cards2.add(cardb);
        cards2.add(cardc);
        final Deck deck1 = new Deck(cards2);

        //when
        final Round round1 = new Round(deck1);

        //then
        assertEquals(round1.deck.countCards(), 3);
    }

    @Test
    void testCurrentCard(){
        //given
        final Card card1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
        final Card card2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
        final Card card3 = new Card("Describe in words the exact direction that is 697.5° clockwise from due north?", "North north west", "STEM");
        final List<Card> cards2 = new ArrayList<Card>();
        cards2.add(card1);
        cards2.add(card2);
        cards2.add(card3);
        final Deck deck1 = new Deck(cards2);
        final Round round1 = new Round(deck1);

        //when
        round1.currentCard();
        round1.takeTurn("New Orleans");

        //then
        assertEquals(round1.currentCard(), card1);
        System.out.print(round1.getClass());
    }


}