package Deck;

import Card.Card;

import java.util.List;
import java.util.stream.Collectors;

public class Deck {
    public List<Card> cards;

    public Deck(final List<Card> cards) {
        this.cards = cards;
        System.out.println(cards);
        System.out.println("Making a Deck!");
    }

    public long countCards(){
        if (cards.isEmpty()){
            return 0;
        } else {
            long total = cards.size();
            return total;
        }
    }

    public List<Card> cardsInCategory(String category){
        List<Card> possibleAnswers = cards.stream()
                    .filter(card -> card.category.equals(category))
                    .collect(Collectors.toList());
        return possibleAnswers;
        }
}


