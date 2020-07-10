package Round;


import Card.Card;
import Deck.Deck;
import Turn.Turn;

public class Round {
    public Deck deck;
    public Turn turn;

    public Round(final Deck deck){
        this.deck = deck;
        System.out.println(deck.cards);
        System.out.println("Creating a round!");
    }

    public Card currentCard(){
      return deck.cards.iterator().next();
    }

    public void takeTurn(final String guess){
        var card = currentCard();
        newTurn(guess, card);
    }

    public void newTurn(String guess, Card card){
        new Turn(guess, card);
    }

}

