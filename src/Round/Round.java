package Round;


import Deck.Deck;

public class Round {
    public Deck deck;
    public Round(final Deck deck){
        this.deck = deck;
        System.out.println(deck.cards);
        System.out.println("Creating a round!");
    }

    
}
